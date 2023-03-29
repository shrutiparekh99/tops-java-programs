public class ThreadException {
            public static void main(String[] args)throws Exception {
				Thread t=Thread.currentThread();
				System.out.println("Current Thread : "+t);
				t.setName("My Thread");
				System.out.println("After Name Change : "+t);
				t.setPriority(7);
				System.out.println("After Priority Change : "+t);

				for(int i=0;i<5;i++)
				      {
						System.out.println(t+" : "+i);
						Thread.sleep(2000);
						}
						
			}
	}


