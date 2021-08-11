package dz.collec;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {
	public static void main(String[] args) {
		
		//*********************************************************************************
	    // ******************************* List ********************************************** 
		// des doonnee duplique 
		System.out.println("************ LIST *******************");
		List l1 = new LinkedList(); 
		
		l1.add(1);
		l1.add(23);
		l1.add(98);
		l1.add(3, 55);
	    System.out.println(	l1.remove(0));
		System.out.println(l1.contains(3));
	    System.out.println(l1.size());
	    Object o[] = l1.toArray();
	    
	    // parcour 
	       
	    Iterator it = l1.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    for(int i=0; i<l1.size(); i++) {
	    	System.out.println(l1.get(i));
	    }
	    
	     for (Object o1 : l1) {
	    	 System.out.println(o1);
	     }
		//*********************************************************************************
	    // ******************************* Set ********************************************** 
	    // les donneees sont unique 
	     System.out.println("********* SET ************************");
	     Set s1 = new HashSet();
	     Set s2 = new TreeSet(); // list ordonnee 
	     
	     s1.add(23);
	     s1.add(23);
	     s1.add(null);
	     s1.add(43);
	     s1.add(10);
	     s1.add(1);
	     s1.remove(5);
	     s1.contains(23);
	    System.out.println( s1.isEmpty());
	    // parcour 
	     Iterator it1 = s1.iterator();
	     while (it1.hasNext()) {
	    	 System.out.println(it1.next());
	     }
	     
	     for (Object o2 : s1) {
	    	 System.out.println(o2);
	     }
	     
	   //*********************************************************************************
	   // ******************************* MAP ********************************************** 
	    System.out.println("*********************** MAP *******************************");
        Map m1 = new Hashtable();
        Map m2 = new TreeMap();
        m1.put("Fname", "A_djalil");
        m1.put("Lname", "Louhichi");
        m1.put("age", 23);
        
        System.out.println(m1.containsKey("Lname"));
        System.out.println(m1.containsValue(23));
        m1.remove("Lname");
        System.out.println(2);
        
        // parcour 
        Set s = m1.keySet();
        Iterator it2 = s.iterator();
        while (it2.hasNext()) {
        	System.out.println(it2.next());
        }
     // you can also use this 
       /* for (Iterator it3 = m1.keySet().iterator(); it3.hasNext();) { 
        	System.out.println(it3.next());
        }*/
        // this used only with hashtable 
        Enumeration en = ((Hashtable)m1).elements();
	     while (en.hasMoreElements()) {
	    	 System.out.println(en.nextElement());
	     }
	}
	

}
