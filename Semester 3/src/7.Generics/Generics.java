package Generics;

import java.util.ArrayList;
import java.util.Scanner;
//Generic class
class Generic<T> {
    private int size;

    Scanner sc = new Scanner(System.in);
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    //object of arraylist.
    ArrayList<T> arr = new ArrayList<T>();

    //method to get data in the arraylist from the user.
    public void accept(){
        System.out.print("Enter size of the array : ");
        setSize(sc.nextInt());
        T data;
        for(int i = 0 ; i < getSize();i++){
            System.out.print("Enter element "+(i+1)+" : ");
            data = (T) sc.next();
            arr.add(data);
        }
    }

    //method to display the data in the arraylist.
    public void display(){
        System.out.println("The elements in the array are : "+arr+" ");
    }

    //method to find even and odd elements in an integer arraylist.
    public void evenOdd(){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int count  = 0, count1 = 0;
        for (int i = 0; i < arr.size(); i++){
            String element = (String) arr.get(i);
            int num = Integer.parseInt(element);
            if((num % 2 == 0)){
                even.add(num);
                count++;
            }
            else{
                odd.add(num);
                count1++;
            }
        }

        System.out.println("The even elements are : "+even+" ");
        System.out.println("Even count: "+count);
        System.out.println("The odd elements are : "+odd+" ");
        System.out.println("Odd count: "+count1);
    }

    //method to find prime numbers in an integer arraylist.
    public void prime(){
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            String element = (String) arr.get(i);
            int num = Integer.parseInt(element);
            boolean flag = true;
            if(num == 0 || num == 1){
                flag = false;
            }
            for (int j = 2; j <= num/2; j++){
                if (num % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                prime.add(num);
                count++;
            }
        }

        System.out.println("Prime numbers in the array are : "+prime+" ");
        System.out.println("Prime count: "+count);
    }

    //to find the palindromes in the string array.
    public void palindrome(){
        ArrayList<String> palindrome = new ArrayList<String>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++){
            String old = (String) arr.get(i);
            String latest = "";

            for(int j = old.length()-1;j >= 0; j--){
                latest = latest + old.charAt(j);
            }

            if(old.equals(latest)){
                palindrome.add(old);
                count++;
            }
        }

        System.out.println("The palindromes in the array are : "+palindrome+" ");
        System.out.println("Palindrome count: "+count);
    }
}
