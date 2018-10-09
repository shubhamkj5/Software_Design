


   public class TestLList{

    public static void main(String[] args){

	                LinkedList l=new LinkedList();


					String name;
					int age;

					int choice=0;
					while (choice!=10){
 						System.out.println();
				    	System.out.println("Menu:");
						System.out.println("1: Insert");
						System.out.println("2: Delete");
						System.out.println("3: Print_list");
                                                System.out.println("4: search");
                                                System.out.println("5: count");
                                                System.out.println("6: insert last");
						System.out.println("");
						System.out.println("9: Initialize");
						System.out.println("10: Exit \n");
						choice=Console.readInt("Enter Choice");
						switch(choice){
							    case 1:
							         name=Console.readLine("Enter Name:");
							         age=Console.readInt("Enter Age:");
							         l.insert(name,age);
								       break;
							    case 2:
							          String d=l.delete_first();
							          System.out.println(d+" deleted");
								       break;

							    case 3:   l.printlist();
								        break;

							    case 4:
							         name=Console.readLine("Enter Name:");
							         boolean res1=l.search(name);
                                                                 System.out.println("Found= "+res1);
								       break;

							    case 5:
							         name=Console.readLine("Enter Name:");
							         int res2=l.count(name);
                                                                 System.out.println("Count== "+res2);
								       break;

                                                            case 6:
							         name=Console.readLine("Enter Name:");
							         age=Console.readInt("Enter Age:");
							         l.insert_last(name,age);
								       break;

								case 9:  
                                                                      l.insert("A",5);
							              l.insert("B",15);
							              l.insert("C",4);
							              l.insert("D",8);
		                                                      l.insert("B",25);
                                                                      l.insert("B",20);
								        break;     
								        
								        
								        
							    default:}
							}
   }}


