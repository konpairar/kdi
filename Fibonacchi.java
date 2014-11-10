public class Fibonacchi{

    public void run(int num){
	int[] fibo = new int[num];
	fibo[0]=0;
	fibo[1]=1;
	for(int i=0;i<fibo.length-2;i++){
	    fibo[i+2]=fibo[i]+fibo[i+1];
	}
	for(int i=0;i<fibo.length;i++){
	    System.out.println(fibo[i]);
	}
    }

    public static void main(String[] args){
	Fibonacchi app =new Fibonacchi();
	int num=Integer.parseInt(args[0]);
	app.run(num);
    }

}

