import java.util.Scanner;


   public class TestLList{

    public static void main(String[] args){

	               MyArrayList l=new MyArrayList(9);
	               Scanner sc = new Scanner(System.in);

					String name;
					int age;

					int choice=0;
					while (choice!=11){
 						System.out.println();
				    	System.out.println("Menu:");
						System.out.println("1: Insert");
						System.out.println("2: Delete");
						System.out.println("3: Print_list");
                        System.out.println("4: search");
                        System.out.println("5: count");
                        System.out.println("6: Age of oldest");
						System.out.println("7: How many Over than given Age");
						System.out.println("8: Is Everone Older than given Age");
						System.out.println("9: Initialize");
						System.out.println("10: Search First");
						System.out.println("11: Exit \n");
						System.out.print("\nPlease enter a value-->");
						choice=sc.nextInt();
						switch(choice){
							    case 1:
									System.out.print("Enter Name:");
									name=sc.next();
										System.out.print("Enter Age:");
										age=sc.nextInt();
							         l.insert(name,age);
								       break;
							    case 2:
							          String d=l.delete_last();
							          System.out.println(d+" deleted");
								       break;

							    case 3:   l.printlist();
								        break;

							    case 4:
									System.out.print("Enter Name:");
									name=sc.next();
							         boolean res1=l.search(name);
                                                                 System.out.println("Found= "+res1);
								       break;

							    case 5:
									System.out.print("Enter Name:");
									name=sc.next();
							         int res2=l.count(name);
                                                                 
							         System.out.println("Count== "+res2);
								       break;

                                case 6:
                                	System.out.println("Max Age== "+l.oldest());
								       break;
                                case 7:
									System.out.print("Enter Age:");
									age=sc.nextInt();
                                	System.out.println("Older than"+ age+" == "+l.olderThan(age));
								       break;
                                case 8:
                                	System.out.print("Enter Age:");
									age=sc.nextInt();
                                	System.out.println("Max Age== "+l.isoldest(age));
								       break;      
								case 9:  
                                          l.insert("A",5);
							              l.insert("B",15);
							              l.insert("C",4);
							              l.insert("B",8);
		                                  l.insert("E",25);
                                          l.insert("F",20);
								        break;     
								 case 10:
									 System.out.print("Enter Name:");
									 name=sc.next();
								     int res21=l.seachAgeFirst(name);
	                                 System.out.println("Age== "+res21);
									       break;
								        
								        
							    default:}
							}
					sc.close();
   }}


