
public class act_4 {
	public static void main(String[] args) {
		int matris [][]={{1,2,3},{4,3,8},{9,8,9}};
		int valortotal=introducedeteminante (matris);
		System.out.println("el determinante es " +valortotal);
		

	}
private static int introducedeteminante(int matris [][]) {
	int multiplicacion1=0, multiplicacion2=0,multiplicacion3=0;
	int multiplicacion4=0,multiplicacion5=0,multiplicacion6=0;
	int resultado1, resultado2;
	int total;
	
	multiplicacion1=(matris[0][0]*matris[1][1]*matris[2][2]);//diagonal principal
	multiplicacion2=(matris[1][0]*matris[2][1]*matris[0][2]);
	multiplicacion3=(matris[0][1]*matris[1][2]*matris[2][0]);
	
	
	multiplicacion4=(matris[0][2]*matris[1][1]*matris[2][0]);//diagonal secundaria
	multiplicacion5=(matris[1][0]*matris[0][1]*matris[2][2]);
	multiplicacion6=(matris[2][1]*matris[1][2]*matris[0][0]);
	
	resultado1=multiplicacion1+multiplicacion2+multiplicacion3;
	resultado2=multiplicacion4+multiplicacion5+multiplicacion6;
	total=resultado1-resultado2;
	return total;
	}
}
