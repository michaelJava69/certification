package com.Michael;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
    	  //throw new UnsupportedOperationException("Waiting to be implemented.");
    	 String[] newP=newPath.split("/");
    	 String[] oldP=path.split("/");
    	 
    	 System.out.println("newP "+newP);
    	 System.out.println("oldP "+oldP);
    	 int lnCount=0;
    	 for(String str:newP){
    		 if(str.equals("..")){
        	     lnCount++;
        	 }
    		 System.out.println("str "+str);
    		 System.out.println("lnCount "+lnCount);
    	 }
    	 
    	 int len=oldP.length;
    	 String strOut="";
    	 for(int i=0;i<len-lnCount;i++){
    	    strOut=strOut+oldP[i]+"/";
    	 }
    	 System.out.println("strOut "+strOut);
    	 
    	 len=newP.length;
          for(int i=0;i<len;i++){
    	    if(!newP[i].equals(".."))
    	    {
    	    	strOut=strOut+newP[i]+"/";
    	    }
    	  }
          System.out.println("strOut "+strOut);
          path=strOut.substring(0, strOut.length()-1);
          System.out.println(path);
          
          System.out.println("path "+path);
    }
    
    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../../x");
        System.out.println(path.getPath());
    }

	 
}
