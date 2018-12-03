import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	private Button but = new Button("bruh");
	
	int tempInst = (int) (Math.random() * (25 - 0));
	int hygroInst = (int) (Math.random() * (100 - 0));
	int pixJaugeT;
	int pixJaugeH;
	int lastTemp[] = {15, 5, 2, 6, 8, 10, 14, 16, 22, 19, 18, 15, 17, 16, 12, 0};
	int pixGrapheX;
	int pixGrapheY;
	int grapheTimeX = 500;
	int grapheTimeY = 530;

	public void paintComponent(Graphics g) {
		
		pixJaugeT = tempInst * 16;
		pixJaugeH = hygroInst * 4;		
	
		System.out.println("i've been executed");
		g.drawRect(100, 40, 75, 400);
		g.drawLine(175, 240, 180, 240);
		g.drawLine(175, 40, 180, 40);
		g.drawLine(175, 440, 180, 440);
		
		g.drawString("12,5°C", 185, 245);
		g.drawString("25°C", 185, 45);
		g.drawString("0°C", 185, 445);
		g.drawString("Temp.", 120, 460);
		
		g.drawRect(300, 40, 75, 400);
		g.drawLine(375, 40, 380, 40);
		g.drawLine(375, 240, 380, 240);
		g.drawLine(375, 440, 380, 440);
		
		g.drawString("100%", 385, 45);
		g.drawString("50%", 385, 245);
		g.drawString("0%", 385, 445);
		g.drawString("Hygro.", 320, 460);
		
		
		g.drawLine(495, 440, 950, 440);
		g.drawLine(530, 440, 530, 445);
		g.drawLine(560, 440, 560, 445);
		g.drawLine(590, 440, 590, 445);
		g.drawLine(620, 440, 620, 445);
		g.drawLine(650, 440, 650, 445);
		g.drawLine(680, 440, 680, 445);
		g.drawLine(710, 440, 710, 445);
		g.drawLine(740, 440, 740, 445);
		g.drawLine(770, 440, 770, 445);
		g.drawLine(800, 440, 800, 445);
		g.drawLine(830, 440, 830, 445);
		g.drawLine(860, 440, 860, 445);
		g.drawLine(890, 440, 890, 445);
		g.drawLine(920, 440, 920, 445);
		g.drawLine(950, 440, 950, 445);
		
		g.drawString("-15s", 490, 460);
		g.drawString("-10s", 640, 460);
		g.drawString("-5s", 790, 460);
		g.drawString("0s", 940, 460);
		
		g.drawLine(500, 40, 500, 445);	
		g.drawLine(495, 40, 950, 40);
		g.drawLine(495, 120, 950, 120);
		g.drawLine(495, 200, 950, 200);
		g.drawLine(495, 280, 950, 280);
		g.drawLine(495, 360, 950, 360);
		
		g.drawString("0°C", 467, 425);
		g.drawString("5°C", 467, 349);
		g.drawString("10°C", 465, 273);
		g.drawString("15°C", 465, 197);
		g.drawString("20°C", 465, 121);
		g.drawString("25°C", 465, 45);
		
		
		g.setColor(Color.red);
		g.fillRect(101, 440-pixJaugeT, 74, pixJaugeT);
		g.drawString(tempInst+"°C", 65, 445-pixJaugeT);
		
		for (int i = 1; i <= 15; i++) {
			
			pixGrapheX = lastTemp[i-1] * 16;
			pixGrapheY = lastTemp[i] * 16;
		
			g.drawLine(grapheTimeX, 440-pixGrapheX, grapheTimeY, 440-pixGrapheY);
			
			grapheTimeX = grapheTimeY;
			grapheTimeY = grapheTimeY + 30;
		
		}
		
		g.setColor(Color.blue);
		g.fillRect(301, 440-pixJaugeH, 74, pixJaugeH);
		g.drawString(hygroInst+"%", 265, 445-pixJaugeH);
	}

}
