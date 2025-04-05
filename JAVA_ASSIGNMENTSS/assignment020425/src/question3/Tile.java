/*
3.     Create class Tile to store the edge length of a square tile , and  create another  class Floor to store length and width of a rectangular floor.  
Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/
package question3;

public class Tile  {
	protected int edge;

	public Tile()
	{}
	public Tile(int edge) {
		super();
		this.edge = edge;
	}

	@Override
	public String toString() {
		return "Tile [edge=" + edge + "]";
	}
	
	
}
