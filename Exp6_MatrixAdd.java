package Expt6;
import java.util.Scanner;

class Matrix {
	Scanner sc = new Scanner(System.in);
	int rows, cols;
	int matrix[][];

	Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		matrix = new int[rows][cols];
	}

	public void initialize() {
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	public void display() {
		System.out.println("Matrix Elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
			
		System.out.println();
	}

	public void add(Matrix m2) {
		Matrix result = new Matrix(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.matrix[i][j] = matrix[i][j] + m2.matrix[i][j];
				}
		}
				
		System.out.println("Matrix Addition Result: ");
		result.display();
	}
			
	public void subtract(Matrix m2) {
		Matrix result = new Matrix(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result.matrix[i][j] = matrix[i][j] - m2.matrix[i][j];
			}
		}
			
		System.out.println("Matrix Subtraction Result: ");
		result.display();
	}
			
	public void multiply(Matrix m2) {
		if (cols != m2.rows) {
			System.out.println("Matrix multiplication is not possible. Columns of first matrix must equal rows of second matrix.");
			return;
			}

	Matrix result = new Matrix(rows, m2.cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < m2.cols; j++) {
				for (int k = 0; k < cols; k++) {
					result.matrix[i][j] += matrix[i][k] * m2.matrix[k][j];
					}
			}
		}
					
		System.out.println("Matrix Multiplication Result: ");
		result.display();
	}
}
					
public class MatrixAdd {
					
	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows for both matrices: ");
		int rows = sc.nextInt();
					
		System.out.print("Enter Number of Columns for both matrices: ");
		int cols = sc.nextInt();
					
		Matrix m1 = new Matrix(rows, cols);
		System.out.println("Enter elements for Matrix 1:");
		m1.initialize();
		m1.display();
					
		Matrix m2 = new Matrix(rows, cols);
		System.out.println("Enter elements for Matrix 2:");
		m2.initialize();
		m2.display();
					
		int choice, repeatChoice;
					
		do {
			System.out.println("Which Operation Would You Like to Perform?");
			System.out.println("Press:\n 1 -> Addition\n 2 -> Subtraction\n 3 -> Multiplication");
			choice = sc.nextInt();
				
			switch (choice) {
				case 1:
					m1.add(m2);
					break;
				case 2:
					m1.subtract(m2);
					break;
				case 3:
					m1.multiply(m2);
					break;
				default:
					System.out.println("INVALID OPERATION");
			}

			System.out.println("Do You Want to Perform Another Operation? (Press 1 for Yes, 0 for No.");
			repeatChoice = sc.nextInt();
		}
		
		while (repeatChoice == 1);
	}
}