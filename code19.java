class code19
 
{
public int roll;
public String name;
code19(int roll,String name)
{
this.roll=roll;
this.name=name;
}
 
public static void main(String[]args)
{
code19[]arr;
arr=new code19[5];
arr[0]=new code19(1,"A");
arr[1]=new code19(2,"b");
arr[2]=new code19(3,"c");
arr[3]=new code19(4,"d");
arr[4]=new code19(5,"e");
for (int i=0;i<arr.length;i++)
{
System.out.println(arr[i].roll+" "+arr[i].name);
}
}
}
