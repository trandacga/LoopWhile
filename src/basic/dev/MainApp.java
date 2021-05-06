package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11.1
				{var i=1;
				int sum=0;
				while (i<=100) {
					sum=sum+i;
					i++;
				}
				System.out.println("tong cac so tu 1 den 100= "+sum);}
				//11.2
				Scanner sc = new Scanner(System.in);
				{System.out.println("nhap vao so n= ");
				int n = sc.nextInt();
				var i=1;
				int sum=0;
				while(i<n) {
					if (i%3==0) {
						sum=sum+i;
					}
					i++;
				}
				System.out.println("tong cac so chia het cho 3 va be hon n =  "+sum);
				}
				//11.3
				{
					   int count = 100, num1 = 0, num2 = 1;
				        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
				        int i=1;
				        while(i<=count)
				        {
				            System.out.print(num1+" ");
				            int sumOfPrevTwo = num1 + num2;
				            num1 = num2;
				            num2 = sumOfPrevTwo;
				            i++;
				        }
				        System.out.println();
				        System.out.println("----------------------------");		
				}
				//11.4
				{
					System.out.println("nhap vao so can kiem tra n = ");
					int n = sc.nextInt();
					int soDaoNguoc = 0;
					int soGoc;
					soGoc=n;
					while(n != 0) {
						int x = n % 10;
						soDaoNguoc = soDaoNguoc * 10 + x;
						n /= 10;
					}
					if(soGoc == soDaoNguoc) System.out.println(soGoc+ " là số đối xứng!!");
					else System.out.println(soGoc+ " không phải là số đối xứng!!");
					
				}
				//11.5
				System.out.println("Các số lớn hơn 99 và bé hơn 1000 có tổng các chữ số chia hết cho 3 là: ");
				{
					int i=100;
					int a,b,c;
					
				
					while(i<1000){
						int x = i;
						a= x/100;
						b= (x%100)/10;
						c=(x%100)%10;
						int d = a+ b +c;
						if (d % 3 == 0) 
							System.out.print(+i+"\t");
						i++;
					}
						
					
			

				}
			}

		}
	