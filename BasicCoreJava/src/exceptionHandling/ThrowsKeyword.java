/*
 * package exceptionHandling;
 * 
 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException;
 * 
 * public class ThrowsKeyword {
 * 
 * public static void main(String[] args) throws {
 * 
 * test();
 * 
 * test1();
 * 
 * test2();
 * 
 * test3();
 * 
 * test4(); } public static void test()throws FileNotFoundException//To declare
 * the checked exception FileInputStream file = new FileInputStream(
 * "E:\\\\7072020\\\\Automation7072020\\\\BasicCoreJava\\\\src\\\\FileHandeling\\\\TestData.properties"
 * );
 * 
 * 
 * 
 * 
 * 
 * public static void test2() { try { FileInputStream file =new FileInputStream(
 * "E:\\\\7072020\\\\Automation7072020\\\\BasicCoreJava\\\\src\\\\FileHandeling\\\\TestData.properties"
 * ); } catch (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * public static void test3() throws ArithmeticException {
 * 
 * 
 * } public static void test4() throws IOException { }
 */