
public class QuestionTwo {

	public static void main(String[] args) {	
		Integer[][] colorMatrix = { {1,2,3},
				{4,5,6},{7,8,9},{10,11,12}
				};
		
		Image img = new Image();
		img.setColorMatrix(colorMatrix);
		
		System.out.println(img);
		img.Negate();
		System.out.println(img);
		
		img.setImageColor(3, 2, 21);
		System.out.println(img);
	}

}

