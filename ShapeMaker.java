package facade;

import java.util.ArrayList;

import facade.shapes.*;

public class ShapeMaker {

	private ShapeFacade shapeF;
	private ArrayList<ShapeFacade> listShape;

	public static final String CIRCLE = "CIRCLE";
	public static final String SQUARE = "SQUARE";
	public static final String RECTANGLE = "RECTANGLE";

	public ShapeMaker() {
		this.listShape = new ArrayList<ShapeFacade>();
		this.listShape.add(new Circle());
		this.listShape.add(new Square());
		this.listShape.add(new Rectangle());
	}

	public ShapeMaker(String shape) {
		this.listShape = new ArrayList<ShapeFacade>();
		switch (shape) {
		case CIRCLE:
			this.listShape.add(new Circle());
			break;
		case SQUARE:
			this.listShape.add(new Square());
			break;
		case RECTANGLE:
			this.listShape.add(new Rectangle());
			break;
		default:
			break;
		}
	}

	public void drawCircle() {
		for (ShapeFacade s : this.listShape) {
			if (s instanceof Circle) {
				s.draw();
			}
		}
	}

	public void drawRectangle() {
		for (ShapeFacade s : this.listShape) {
			if (s instanceof Rectangle) {
				s.draw();
			}
		}
	}

	public void drawSquare() {
		for (ShapeFacade s : this.listShape) {
			if (s instanceof Square) {
				s.draw();
			}
		}
	}

	public void draw() {
		for (ShapeFacade s : this.listShape) {
			s.draw();
		}
	}

	public void draw(String shape) {
		switch (shape) {
		case CIRCLE:
			for (ShapeFacade s : this.listShape) {
				if (s instanceof Circle) {
					s.draw();
				}
			}
			break;
		case SQUARE:
			for (ShapeFacade s : this.listShape) {
				if (s instanceof Rectangle) {
					s.draw();
				}
			}
			break;
		case RECTANGLE:
			for (ShapeFacade s : this.listShape) {
				if (s instanceof Square) {
					s.draw();
				}
			}
			break;
		default:
			break;
		}
	}

}
