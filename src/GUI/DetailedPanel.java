package GUI;

import java.awt.*;

import javax.swing.*;

public class DetailedPanel extends JPanel {
	public DetailedPanel() {
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		setBorder(BorderFactory.createTitledBorder("TitledBorder"));

		JLabel jlh = new JLabel("����ֵ");
		JSpinner jsh = new JSpinner();
		JLabel jlat = new JLabel("����ֵ");
		JSpinner jsat = new JSpinner();
		JLabel jlau = new JLabel("����ֵ");
		JSpinner jsau = new JSpinner();
		JLabel jlr = new JLabel("ħ��ֵ");
		JSpinner jsr = new JSpinner();
		JLabel jlab = new JLabel("ħ������ֵ");
		JSpinner jsab = new JSpinner();
		// JButton jbt = new JButton("ok");
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		jsh.setSize(100, 200);
		add(jlh);
		add(jsh);
		add(jlat);
		add(jsat);
		add(jlau);
		add(jsau);
		add(jlr);
		add(jsr);
		add(jlab);
		add(jsab);
		// add(jbt);
	}

}
