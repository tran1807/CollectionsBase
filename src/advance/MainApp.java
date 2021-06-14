package advance;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	static List<Shape> readFromFile(String fileName) throws IOException {
		List<Shape> stdList = new ArrayList<>();
		// Open the file
		FileInputStream fstream = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  if(strLine.indexOf("#Circle") == 0) {
			  String name = strLine.substring(1, strLine.length() - 1);
			 double r = Double.parseDouble(br.readLine());
			Shape circle = new Circle(name, r);
			  stdList.add(circle);
		  }
		  if(strLine.indexOf("#Triangle") == 0) {
			  String name = strLine.substring(1, strLine.length() - 1);
			  double a = Double.parseDouble(br.readLine());
			  double b = Double.parseDouble(br.readLine());
			  double c = Double.parseDouble(br.readLine());
			  Shape triangle = new Triangle(name, a, b, c);
			  stdList.add(triangle);
		  }
		  if(strLine.indexOf("#Rectangle") == 0) {
			  String name = strLine.substring(1, strLine.length() - 1);
			  double a = Double.parseDouble(br.readLine());
			  double b = Double.parseDouble(br.readLine());
			  Shape rectangle = new Rectangle(name, a, b);
			  stdList.add(rectangle);
		  }
		}

		//Close the input stream
		fstream.close();

		return stdList;
	}

	static void print(List<Shape> shapes) {
		Scanner sc = new Scanner(System.in);
		Iterator<Shape> ite = shapes.iterator();
		while (ite.hasNext()) {
			Shape shape = ite.next();
			System.out.println(shape.toString());
		}
	}
	static void findMaxDienTich(List<Shape> shapes) {
		Iterator<Shape> it = shapes.iterator();
		Shape maxdientich = shapes.get(0);
		while (it.hasNext()) {
			Shape shape = it.next();
			if(maxdientich.dienTich() < shape.dienTich()) {
				maxdientich = shape;
			}
		}
		if (maxdientich instanceof Circle) {
			String str = String.format("Hinh tron co dien tich lon nhat - %s -- %f", maxdientich.name,maxdientich.dienTich());
			System.out.println(str);
		}else if (maxdientich instanceof Rectangle) {
			String str = String.format("Hinh chu nhat co dien tich lon nhat - %s -- %f", maxdientich.name,maxdientich.dienTich());
			System.out.println(str);
		}else {
			String str = String.format("Hinh tam giac co dien tich lon nhat - %s -- %f", maxdientich.name,maxdientich.dienTich());
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes ;
		try {
            shapes = readFromFile("input.txt");
			print(shapes);
			findMaxDienTich(shapes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
