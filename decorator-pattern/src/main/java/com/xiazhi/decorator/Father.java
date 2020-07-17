package com.xiazhi.decorator;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport report = new FouthSchoolReport();
        report = new HighScoreDecorator(report);
        report = new SortScoreDecorator(report);

        report.report();
    }
}
