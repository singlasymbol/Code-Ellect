import java.io.*;
import java.util.*;
public class Solution{
	
	static class City implements Comparable<City>
	{
	    float pop;
	    float avg;
	    float clinics;
	    
	    City(float pop)
	    {
	        this.pop = pop;
	        this.avg  = pop;
	        this.clinics = 1;
	    }
	    
	    public void addClinics()
	    {
	        this.clinics++;
	        this.avg= this.pop/this.clinics;   
	        
	            
	    }
	    
	    public int compareTo(City obj)
	    {
	        if(this.avg < obj.avg) return 1;
	        if(this.avg > obj.avg) return -1;
	        
	        return 0;
	    }
	    
	}
	
	public static void main(String[] args){
		
	    Scanner scan = new Scanner(System.in);
	    float cities,population ,clinics;
        
        PriorityQueue<City> q = new PriorityQueue<City>();
        
	    cities = scan.nextFloat();
	    clinics = scan.nextFloat();
	    
	    for(int i = 0;i< cities;i++)
	    {
	        population = scan.nextInt();
	        q.add(new City(population));
	    }
	    
	    clinics = clinics - cities;
	  //  System.out.println(clinics);
	    
	    while(clinics  > 0)
	    {
	        City temp = q.poll();
	       // System.out.println(temp.avg);
            temp.addClinics();
	        q.add(temp);
	        clinics--;
	    }
	    City temp = q.poll();
	    temp.avg =(int) Math.ceil(temp.avg);
	    System.out.println((int)temp.avg);
	}
}