import java.util.Arrays;

public class Image {
		private Integer[][] colorMatrix;

		public Integer[][] getColorMatrix() {
			return colorMatrix;
		}

		public void setColorMatrix(Integer[][] colorMatrix) {
			this.colorMatrix = colorMatrix;
		}
		
		public void Negate() {
			for(int i=0; i< colorMatrix.length; i++) {
				for(int j=0; j< colorMatrix[0].length; j++) {
					colorMatrix[i][j] = 255 - colorMatrix[i][j];
				}
			}
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Image [colorMatrix= [");
			
			for(int i=0; i< colorMatrix.length; i++) {
				sb.append("{");
				for(int j=0; j< colorMatrix[0].length; j++) {
					if(j == colorMatrix[0].length - 1) {
						sb.append(colorMatrix[i][j]);
					}else {
						sb.append(colorMatrix[i][j] +",");
					}
				}
				if(i == colorMatrix.length - 1) {
					sb.append("}");
				}else {
					sb.append("},");
				}
			}
			
			sb.append("]]");
			
			return sb.toString();
		}
		
		public void setImageColor(int X, int Y, int value) {
			Boolean done = false;
			if(value >=0 && value <= 255) {
				if(X >=0 && X < colorMatrix.length) {
					if(Y >=0 && Y < colorMatrix[0].length) {
						colorMatrix[X][Y] = value;
						done = true;
					}
				}
			}
			
			if(!done) {
				System.out.println("Invalid details. Cannot update image.");
			}
		}
}

