package JavaMisc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee {
    static class EmployeeRecord{
        public String ID;
        public String first_name;
        public String last_name;
        public String joining_date;
        public String salary;
        public Date d;
        public EmployeeRecord(String ID, String first_name,String last_name,String joining_date,String salary) throws ParseException {
            this.first_name = first_name;
            this.salary = salary;
            this.ID= ID;
            this.last_name = last_name;
            this.joining_date = joining_date;
            this.d= new SimpleDateFormat("dd/MM/YYYY").parse(joining_date);
        }
        public Date getDate(){
            return this.d;
        }
    }
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("E:\\javaprojs\\microservices\\RunningClass\\src\\JavaMisc\\Employee.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st="";
        List<EmployeeRecord> ob = new ArrayList<>();
        int firstLineCount =0;
        while((st = br.readLine())!= null){
            if(firstLineCount == 0){
                String nameArr[] = st.split(",");
            }else {
                String valueArr[] = st.split(",");
                EmployeeRecord obj = new EmployeeRecord(valueArr[0], valueArr[1], valueArr[2], valueArr[3], valueArr[4]);
                ob.add(obj);
            }
            firstLineCount++;
        }
        Collections.sort(ob, new Comparator<EmployeeRecord>() {
            @Override
            public int compare(EmployeeRecord o1, EmployeeRecord o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        for(EmployeeRecord obj :ob){
            System.out.println(obj.ID+" "+ obj.first_name+" "+obj.last_name+" "+obj.joining_date+" "+obj.salary);
        }




    }

}
