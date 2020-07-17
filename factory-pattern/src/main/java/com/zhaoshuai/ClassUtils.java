package com.zhaoshuai;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class ClassUtils {


    public static List<Class<?>> getAllClassByInterface(Class<?> clazz) {
        if (!clazz.isInterface()) {
            return Collections.emptyList();
        }

        ClassLoader classLoader = clazz.getClassLoader();

        String name = clazz.getPackage().getName();
        String path = name.replace(".", "/");
        LinkedList<Class<?>> classes = new LinkedList<>();

        try {
            Enumeration<URL> resources = classLoader.getResources(path);
            LinkedList<File> files = new LinkedList<>();
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                files.add(new File(url.getFile()));
            }

            for (File file : files) {
                List<Class<?>> classes1 = findClasses(file, name);
                for (Class<?> aClass : classes1) {
                    if (clazz.isAssignableFrom(aClass)) {
                        if (Objects.equals(aClass, clazz)) {
                            continue;
                        }
                        classes.add(aClass);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return classes;
    }

    private static List<Class<?>> findClasses(File file, String packageName) {
        if (!file.exists()) {
            return Collections.emptyList();
        }
        LinkedList<Class<?>> classes = new LinkedList<>();

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file1, packageName + "." +
                        file1.getName()));
            } else if (file1.getName().endsWith(".class")) {
                try {
                    classes.add(Class.forName(packageName + '.' +
                            file1.getName().substring(0, file1.getName().length() - 6)));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        return classes;
    }

}
