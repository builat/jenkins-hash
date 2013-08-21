public class jHash{

private String[][] jHash 	= new String[4][3];
private JenkinsHash jenkinsHash = new JenkinsHash();
//private int[] usedCell 		= new int[4];
private int usedLimit = 0;

void put(String stringKey, String stringVal){

			int intKey = jenkinsHash.hash32(stringKey.getBytes());
                        int pc = jenkinsHash.hash32(stringKey.getBytes());
                        int checkKey= 0;
                        for (int jHashLine = 0; jHashLine < jHash.length-1 ; jHashLine++){
                                                        if (jHash[jHashLine][0] != null){
	
							checkKey = Integer.parseInt(jHash[jHashLine][0],10);
                                                        if (checkKey==pc){
									   jHash[jHashLine][2] = stringVal;
						                           return;
                                                                  	 }
							}
			}
			
			for(int jHashLine = 0; jHashLine < jHash.length-1 ; jHashLine++){
							
							if ( usedLimit <(jHash.length*0.75)){
											jHash[usedLimit][0] = Integer.toString(pc);
											jHash[usedLimit][1] = stringKey;
											jHash[usedLimit][2] = stringVal;
											usedLimit++;
											return;
											}


							else{


							String[][] tempjHash = new String[jHash.length][3];

							for (jHashLine = 0; jHashLine<=jHash.length-1;jHashLine++){
														for (int jHashDash=0; jHashDash<=2;jHashDash++) {tempjHash[jHashLine][jHashDash]=jHash[jHashLine][jHashDash];}
														}
							jHash = new String[tempjHash.length*4][3];
							for (jHashLine = 0; jHashLine<=tempjHash.length-1;jHashLine++){
								for (int jHashDash=0; jHashDash<=2;jHashDash++){jHash[jHashLine][jHashDash]=tempjHash[jHashLine][jHashDash];}
															}

                                                                                      
                                                                                        jHash[usedLimit][0] = Integer.toString(pc);
                                                                                        jHash[usedLimit][1] = stringKey;
                                                                                        jHash[usedLimit][2] = stringVal;
                                                                                        usedLimit++;
											return;


						}
					}


				
				};

String get(String stringKey){
			int pc = jenkinsHash.hash32(stringKey.getBytes());
			int longCheckKey;
			for (int jHashLine = 0; jHashLine < jHash.length-1; jHashLine++){
							if(jHash[jHashLine][0] != null){

								longCheckKey = Integer.parseInt(jHash[jHashLine][0]);
								if (longCheckKey==pc){	return (jHash[jHashLine][2]); 	   }
							}
						   }
			return ("");
			}


void del(String stringKey){
    int pc = jenkinsHash.hash32(stringKey.getBytes());

        for (int jHashLine = 0; jHashLine < jHash.length-1; jHashLine++){
	if ((jHash[jHashLine][0] != null) && (Integer.parseInt(jHash[jHashLine][0]) == pc)){
//												System.out.println("StrKey-> " +stringKey);
//												System.out.println("pcMod-> " +pc);
												jHash[jHashLine][0]=null;
												jHash[jHashLine][1]=null;
												jHash[jHashLine][2]=null;
												break;
                     						                              }
                                                				}
					}
}
