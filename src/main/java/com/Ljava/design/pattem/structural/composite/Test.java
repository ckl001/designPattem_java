package com.Ljava.design.pattem.structural.composite;

/**
 * @Auther 20173
 * @Date 2019-4-9 15:29
 * @Des TODO
 **/
public class Test {
    public static void main(String[] args) {
//        CatalogComponent javaCourse = new Course("java课程", 88);
//        CatalogComponent pyCourse = new Course("py课程", 99);
//
//        CatalogComponent javaCourseCatalog = new CourseCatalog("课程目录",2);
//
//        javaCourseCatalog.add(javaCourse);
//        javaCourseCatalog.add(pyCourse);
//
//        javaCourse.print();


            CatalogComponent linuxCourse = new Course("Linux课程",11);
            CatalogComponent windowsCourse = new Course("Windows课程",11);

            CatalogComponent javaCourseCatalog = new CourseCatalog("课程目录",2);

            CatalogComponent mmallCourse1 = new Course("Java",55);
            CatalogComponent mmallCourse2 = new Course("Python",66);
            CatalogComponent designPattern = new Course("PHP",77);

            javaCourseCatalog.add(mmallCourse1);
            javaCourseCatalog.add(mmallCourse2);
            javaCourseCatalog.add(designPattern);

            CatalogComponent imoocMainCourseCatalog = new CourseCatalog("课程主目录",1);
            imoocMainCourseCatalog.add(linuxCourse);
            imoocMainCourseCatalog.add(windowsCourse);
            imoocMainCourseCatalog.add(javaCourseCatalog);

            imoocMainCourseCatalog.print();


        }
}
