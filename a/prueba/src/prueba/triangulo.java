package prueba;

public class triangulo {
	int a;
	int b;
	int c;
	int altura;
		
		public Triangulo ()
		{
			a=100;
			b=200;
			c=100;
			altura=80;
		}
		public int area ()
		{
			int area;
			area=(this.b*this.altura)/2;
			return area;
		}
		public int perimetro ()
		{
			int perimetro;
			perimetro=this.a+this.b+this.c;
			return perimetro;
		}
}
