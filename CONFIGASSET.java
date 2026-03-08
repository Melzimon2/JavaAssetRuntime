import java.time.Duration;
import java.util.Scanner;

public class builderJava {
        public void executor() throws InterruptedException {
            String builderMain = "@AssetMain: ExecuteBuilder@ / @BuilderOverException / @in [Executing]";
            if (builderMain.equals("@AssetMain: ExecuteBuilder@ / @BuilderOverException / @in [Executing]")) {
                System.out.print("> Executing...\n");
                Thread.sleep(20000); // 20,000 = 20 seconds
                System.out.println("> Executed 100%");
                boolean initializing = true;
                if (initializing == true) {
                    System.out.println("Initializing...");
                    Thread.sleep(10000);
                    System.out.println("Initialized 100%");
                    boolean deciderTrue = true;
                    if (deciderTrue == true) {
                        boolean config = true;
                        if (config == true) {
                            System.out.println("Configurated");
                            Thread.sleep(10000);
                            System.out.println("Fetching data code...");
                            boolean fetchdata = true;
                            if (fetchdata == true) {
                                System.out.println("Asset Is Ready!...\n");
                                while (true) {
                                    Scanner exe = new Scanner(System.in);
                                    System.out.print(">> ");
                                    String exeMain = exe.nextLine();
                                    if (exeMain.equals("/functionCode")) {
                                        System.out.println(": code_function, info");
                                        Scanner ops = new Scanner(System.in);
                                        System.out.print("> ");
                                        String opsI = ops.nextLine();
                                        if (opsI.equals("code_function;")) {
                                            System.out.println("Func App: Java, Android, Kotlin. 7.2.1");
                                            
                                        } // code_function
                                    } // exe main
                                } // executor (Main)
                            } // fetchdata
                        } // if config
                    } // deciderTrue
                } // initializing
            } // if builder.main
        } // public void 
    } // public class
