class Exercise10{
    public static void main(String[] args) {
        int max,k=0;
        int arr[][]=new int[3][3];
       if(args.length<9)
            System.out.println("Please enter 9 integer numbers");
       else
       {
       for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
                arr[i][j]=Integer.parseInt(args[k++]);

       System.out.println("The given array is:");

       for(int i=0;i<3;i++)
           {  for(int j=0;j<3;j++)
                   System.out.print(arr[i][j]+" ");
               System.out.println("");
           }
          
       max=arr[0][0];
       
       for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
               if(arr[i][j]>max)
                     max=arr[i][j];
       
       System.out.println("The biggest number in the given array is "+max);
       }
    }


}