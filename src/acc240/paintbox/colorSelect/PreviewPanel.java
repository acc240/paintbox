/*----------------------------------------------------
 * PaintBox is a free open source painting program
 * Copyright (C) 2014 PaintBox Foundation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *--------------------------------------------------*/
package acc240.paintbox.colorSelect;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PreviewPanel extends JPanel {

    @Override
    public void paintComponent(Graphics p) {
        Graphics2D page = (Graphics2D) p;
        super.paintComponent(page);

        int width = getWidth();
        int height = getHeight();

        page.setColor(Color.darkGray);
        page.fillRect(0, 0, width / 4, height / 2);
        page.fillRect(width / 2, 0, width / 4, height / 2);
        page.fillRect(width / 4, height / 2, width / 4, height / 2);
        page.fillRect(3 * width / 4, height / 2, width / 4, height / 2);

        page.setColor(Color.lightGray);
        page.fillRect(width / 4, 0, width / 4, height / 2);
        page.fillRect(3 * width / 4, 0, width / 4, height / 2);
        page.fillRect(0, height / 2, width / 4, height / 2);
        page.fillRect(width / 2, height / 2, width / 4, height / 2);

        page.setColor(getBackground());
        page.fillRect(0, 0, width, height);
    }
}
