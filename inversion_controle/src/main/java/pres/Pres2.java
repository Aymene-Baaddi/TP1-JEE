package pres;

import dao.IDao;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\HP\\Desktop\\TP1-JEE\\inversion_controle\\config.txt");
        Scanner sc = new Scanner(file);
        String daoCLassName=sc.nextLine();
        Class cDao=Class.forName(daoCLassName);
        IDao dao=(IDao) cDao.newInstance();
        System.out.println(dao.getData());
    }
}
