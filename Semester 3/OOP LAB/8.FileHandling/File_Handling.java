package FileHandling;

import java.io.*;
import java.util.Scanner;

class File_Handling {
    private String name, address, Class;
    private int marks, Roll_no;
    private long student_id;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Function to add new records in file
    public void addRecords(){
        try {
            //Writing in a file
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("StudentRecords.txt",true)));
            boolean flag = false;
            do {
                System.out.print("Enter name of Student: ");
                name = br.readLine();
                System.out.print("Enter address: ");
                address = br.readLine();
                System.out.print("Student ID: ");
                student_id = Integer.parseInt(br.readLine());
                System.out.print("Enter Class: ");
                Class = br.readLine();
                boolean flag1 = true;
                while (flag1){
                    try{
                        System.out.print("Enter marks obtained: ");
                        marks = Integer.parseInt(br.readLine());
                        while (marks < 0) {
                            System.out.println("Invalid");
                            System.out.print("Please Enter marks obtained: ");
                            marks = Integer.parseInt(br.readLine());
                        }
                        System.out.print("Enter Roll no: ");
                        Roll_no = Integer.parseInt(br.readLine());
                        while (Roll_no < 0) {
                            System.out.println("Invalid");
                            System.out.print("Please Enter Roll no: ");
                            Roll_no = Integer.parseInt(br.readLine());
                        }
                        flag1 = false;
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                pw.println(name);
                pw.println(address);
                pw.println(student_id);
                pw.println(Class);
                pw.println(marks);
                pw.println(Roll_no);
                System.out.println("Records are added successfully!");
                System.out.println("Do you want to add more records? (y/n)");
                String ch = br.readLine();
                if(ch.equals("y")){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }while(flag);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error while writing in a file.");
        }
    }

    //Function to read the data from file
    public void displayRecords(){
        try {
            //Reading in file
            BufferedReader br = new BufferedReader((new FileReader("StudentRecords.txt")));
            int count = 1;
            while((name = br.readLine()) != null){
                System.out.println("--------------------------------------------------");
                System.out.println("Record: "+count);
                System.out.println("Name      : "+name);
                System.out.println("Address   : "+br.readLine());
                System.out.println("Student ID: "+Integer.parseInt(br.readLine()));
                System.out.println("Class     : "+br.readLine());
                System.out.println("Marks     : "+Integer.parseInt(br.readLine()));
                System.out.println("Roll no   : "+Integer.parseInt(br.readLine()));
                System.out.println("--------------------------------------------------");
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading in a file.");
        } catch (IOException e) {
            System.out.println("Error occurred!!");
        }
    }

    //Function to search a record in file
    public void searchRecords() throws IOException {
        String str;
        System.out.print("\nEnter name of student you want to search: ");
        str = br.readLine();
        //Reading in file
        BufferedReader file = new BufferedReader((new FileReader("StudentRecords.txt")));
        boolean flag = false;

        while((name = file.readLine()) != null){
            if(str.equals(name.toString())) {
                flag = true;
                System.out.println("Record found displaying record");
                System.out.println("--------------------------------------------------");
                System.out.println("Name      : " + name);
                System.out.println("Address   : " + file.readLine());
                System.out.println("Student ID: " + Integer.parseInt(file.readLine()));
                System.out.println("Class     : " + file.readLine());
                System.out.println("Marks     : " + Integer.parseInt(file.readLine()));
                System.out.println("Roll no   : " + Integer.parseInt(file.readLine()));
                System.out.println("--------------------------------------------------");
            }
        }
        if(!flag){
            System.out.println("\nNo record found for "+str);
        }
        file.close();
    }

    //Function to delete the particular record from file
    public void deleteRecords() throws IOException {
        String str;
        System.out.print("\nEnter name of student you want to delete: ");
        str = br.readLine();
        boolean flag = false;
        //Writing in file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt")));
        //Reading in file
        BufferedReader file1 = new BufferedReader((new FileReader("StudentRecords.txt")));

        while((name = file1.readLine()) != null){
            if(str.equals(name.toString())) {
                flag = true;
                System.out.println("Record found Deleting Record");
                System.out.println("--------------------------------------------------");
                System.out.println("\nName    : " + name);
                System.out.println("Address   : " + file1.readLine());
                System.out.println("Student ID: " + Integer.parseInt(file1.readLine()));
                System.out.println("Class     : " + file1.readLine());
                System.out.println("Marks     : " + Integer.parseInt(file1.readLine()));
                System.out.println("Roll no   : " + Integer.parseInt(file1.readLine()));
                System.out.println("--------------------------------------------------");
            }
            else {
                pw.println(name);
                pw.println(file1.readLine());
                pw.println(Integer.parseInt(file1.readLine()));
                pw.println(file1.readLine());
                pw.println(Integer.parseInt(file1.readLine()));
                pw.println(Integer.parseInt(file1.readLine()));
            }
        }
        file1.close();
        pw.close();
        if(flag == false){
            System.out.println("No record found for "+str);
        }
        File f = new File("StudentRecords.txt");
        f.delete();
        //renaming the file
        File oldName = new File("Student.txt");
        File newName = new File("StudentRecords.txt");
        oldName.renameTo(newName);
    }

    //Function to modify the particular record from file
    public void modifyRecords() throws IOException {
        String str;
        System.out.print("\nEnter name of student you want to modify: ");
        str = br.readLine();
        boolean flag = false;
        //Writing in file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt",false)));
        //Reading in file
        BufferedReader file1 = new BufferedReader((new FileReader("StudentRecords.txt")));

        while((name = file1.readLine()) != null){
            if(str.equals(name.toString())) {
                flag = true;
                System.out.println("Record found with following data\nCurrent Record");
                System.out.println("--------------------------------------------------");
                System.out.println("\nName    : " + name);
                System.out.println("Address   : " + file1.readLine());
                System.out.println("Student ID: " + Integer.parseInt(file1.readLine()));
                System.out.println("Class     : " + file1.readLine());
                System.out.println("Marks     : " + Integer.parseInt(file1.readLine()));
                System.out.println("Roll no   : " + Integer.parseInt(file1.readLine()));
                System.out.println("--------------------------------------------------");
                System.out.println();
                System.out.println("-----Enter new Information-----");

                System.out.print("Enter name of Student: ");
                name = br.readLine();
                System.out.print("Enter address: ");
                address = br.readLine();
                System.out.print("Student ID: ");
                student_id = Integer.parseInt(br.readLine());
                System.out.print("Enter Class: ");
                Class = br.readLine();
                boolean flag1 = true;
                while (flag1){
                    try{
                        System.out.print("Enter marks obtained: ");
                        marks = Integer.parseInt(br.readLine());
                        while (marks < 0) {
                            System.out.println("Invalid");
                            System.out.print("Please Enter marks obtained: ");
                            marks = Integer.parseInt(br.readLine());
                        }
                        System.out.print("Enter Roll no: ");
                        Roll_no = Integer.parseInt(br.readLine());
                        while (Roll_no < 0) {
                            System.out.println("Invalid");
                            System.out.print("Please Enter Roll no: ");
                            Roll_no = Integer.parseInt(br.readLine());
                        }
                        flag1 = false;
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                pw.println(name);
                pw.println(address);
                pw.println(student_id);
                pw.println(Class);
                pw.println(marks);
                pw.println(Roll_no);

            }
            else {
                pw.println(name);
                pw.println(file1.readLine());
                pw.println(Integer.parseInt(file1.readLine()));
                pw.println(file1.readLine());
                pw.println(Integer.parseInt(file1.readLine()));
                pw.println(Integer.parseInt(file1.readLine()));
            }
        }
        file1.close();
        pw.close();
        if(flag == false){
            System.out.println("No record found for "+str);
        }
        //Deleting the file which contains matched record
        File f = new File("StudentRecords.txt");
        f.delete();
        //renaming the file
        File oldName = new File("Student.txt");
        File newName = new File("StudentRecords.txt");
        oldName.renameTo(newName);
    }
}

