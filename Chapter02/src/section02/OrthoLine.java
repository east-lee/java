package section02;

public class OrthoLine {
	
	public MyPoint2 u;
	public MyPoint2 v;
	
	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		
		u = p;
		v = q;
		
		if (p.x > q.x || p.x == q.x && p.y > q.y) {
			swap();
		}
		
	}
	
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}
	
	public boolean intersects(OrthoLine other) {
		
		if (isVertical() && !other.isVertical()) {
			
			return (other.u.x < u.x && other.v.x > u.x && other.u.y > u.y && other.u.y < v.y);
			
		} else if (!isVertical() && other.isVertical()) {
			
			return (other.u.y < u.y && other.v.y > u.y && other.u.x > u.x && other.u.x < v.x);
			
		} 
		
		return false;
		
	}
	
	public boolean isVertical() {
		
		return u.x == v.x;
	}
	
	private void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}
	
	
	
	

}
