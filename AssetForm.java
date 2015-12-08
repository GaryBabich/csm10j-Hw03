		JComboBox comboTypesList = new JComboBox(comboTypes);
		comboTypesList.setSelectedIndex(2);
		comboTypesList.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbType = (JComboBox) e.getSource();
				String cmbType = (String) jcmbType.getSelectedItem();
				jlbPicture.setIcon(new ImageIcon(""
						+ cmbType.trim().toLowerCase() + ".jpg"));
			}
