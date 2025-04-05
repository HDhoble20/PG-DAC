/*
3.     Create class Tile to store the edge length of a square tile , and  create another  class Floor to store length and width of a rectangular floor.  
Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/
package question3;

import java.util.Scanner;

public class Floor extends Tile {
		private int len;
		private int width;
		private int area;
		public Floor()
		{
			super();
		}
		public Floor(int len, int width) {
			super();
			this.len = len;
			this.width = width;
		}
		@Override
		public String toString() {
			return "Floor [len=" + len + ", width=" + width + ", area=" + area + "]";
		}
		
		public int totalTiles(Tile t)	
		{
			this.area=this.len*this.width;
			int ans=area/t.edge;
			return ans;
		}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the length of floor: ");
			int l=s.nextInt();
			System.out.println("Enter the width of floor: ");
			int w=s.nextInt();
			Tile t=new Floor(l,w);
			System.out.println("Enter the edge of tile: ");
			int e=s.nextInt();
			Tile t1=new Tile(e);
			System.out.println(((Floor) t).totalTiles(t1));
		}
}
