class pattern5{
    public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        int n=sc.nextInt();
        int s=2*(n-1);
        for(int i=0;i<n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++){
                System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.println();
            s-=2;
        }
    }
}