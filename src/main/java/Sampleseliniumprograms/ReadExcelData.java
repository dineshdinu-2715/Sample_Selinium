package Sampleseliniumprograms;



import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\dinesh\\eclipse-workspac\\Sample_Selinium\\src\\test\\resources\\binaries\\XLSX\\TestData.xlsx.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}