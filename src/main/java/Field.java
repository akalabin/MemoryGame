import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Field {
    private JPanel rootPanel;
    private JPanel cards0;
    private JPanel cards1;
    private JPanel cards2;
    private JPanel cards3;
    private JPanel cards4;
    private JPanel cards5;
    private JPanel cards6;
    private JPanel cards7;
    private JPanel cards8;
    private JPanel cards9;
    private JPanel cards10;
    private JPanel cards11;
    private JPanel cards12;
    private JPanel cards13;
    private JPanel cards14;
    private JPanel cards15;
    private JButton btn0;
    private JLabel lbl0;
    private JButton btn1;
    private JLabel lbl1;
    private JButton btn2;
    private JLabel lbl2;
    private JButton btn3;
    private JLabel lbl3;
    private JButton btn4;
    private JLabel lbl4;
    private JButton btn5;
    private JLabel lbl5;
    private JButton btn6;
    private JLabel lbl6;
    private JButton btn7;
    private JLabel lbl7;
    private JButton btn8;
    private JLabel lbl8;
    private JButton btn9;
    private JLabel lbl9;
    private JButton btn10;
    private JLabel lbl10;
    private JButton btn11;
    private JLabel lbl11;
    private JButton btn12;
    private JLabel lbl12;
    private JButton btn13;
    private JLabel lbl13;
    private JButton btn14;
    private JLabel lbl14;
    private JButton btn15;
    private JLabel lbl15;
    private JLabel lblTime;

    public boolean firstClick = false;
    public boolean secondClick = false;
    public ImageIcon firstImage;
    public ImageIcon secondImage;
    public JButton firstButton;
    public JButton secondButton;
    ArrayList<ImageIcon> images;
    int successCount = 0;
    LocalTime t = LocalTime.now();
    static JFrame frame;
    public long seconds;

    public Field() {
        frame = new JFrame("Memory Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(rootPanel);
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        /*Устанавливаем иконки для окна и кнопок*/
        frame.setIconImage((new ImageIcon(getClass().getResource("img/icon.jpg")).getImage()));
        btn0.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn3.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn4.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn5.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn6.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn7.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn8.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn9.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn10.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn11.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn12.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn13.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn14.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        btn15.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/img/icon.jpg")))
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        frame.setVisible(true);

        /*Создаем коллекцию изображений. Перемешиваем*/
        images = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ImageIcon img = new ImageIcon(getClass().getResource("/img/pic" + i + ".jpg"));
            img = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            images.add(img);
        }
        images.addAll(images);
        Collections.shuffle(images);

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) { // Если две картинки открыты, следующая не открывается
                    lbl0.setIcon(images.get(parseInt(e.getActionCommand())));//Присваиваем label картинку из ArrayList
                    firstOrSecond(e);
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl1.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl2.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl3.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl4.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl5.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl6.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl7.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl8.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl9.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl10.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl11.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl12.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl13.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl14.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!secondClick) {
                    lbl15.setIcon(images.get(parseInt(e.getActionCommand())));
                    firstOrSecond(e);
                }
            }
        });

        new Thread(() -> {// Запускаем таймер игры
            try {
                while (successCount < 8) { //пока не будет 8 совпадений
                    long minutes = ChronoUnit.MINUTES.between(LocalTime.now(), t);
                    seconds = ChronoUnit.SECONDS.between(LocalTime.now(), t);
                    lblTime.setText(String.format("%02d:%02d", Math.abs(minutes), Math.abs(seconds % 60)));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
            }
            ;
        }).start();
    }
    /*Показываем слой с label. Подготавливаем переменные для сравнение*/
    public void firstOrSecond(ActionEvent e) {
        CardLayout c1 = (CardLayout) (((JButton) e.getSource()).getParent().getLayout());
        c1.show(((JButton) e.getSource()).getParent(), "Card2");
        if (!firstClick) {
            firstClick = true;
            firstImage = images.get(parseInt(e.getActionCommand()));
            firstButton = (JButton) e.getSource();
        } else {
            secondClick = true;
            secondImage = images.get(parseInt(e.getActionCommand()));
            secondButton = (JButton) e.getSource();
            compareCards();
        }
    }

    public void compareCards() {
        new Thread(() -> { // Задержка 1с перед закрытием. Отдельным потоком, иначе не видно открытия 2й картинки
            try {
                Thread.sleep(1000);//
            } catch (InterruptedException ex) {
            }
            ;
            if (firstImage == secondImage) {// Если открытые картинки одинаковые,
                successCount++; // увеличиваем счетчик совпадений
                firstClick = false; // сбрасываем переменные
                secondClick = false;
                firstImage = null;
                secondImage = null;
            }
            if (firstImage != secondImage) { //Если открытые картинки разные, возвращаем слой с button
                CardLayout c1 = (CardLayout) (((JButton) firstButton).getParent().getLayout());
                CardLayout c2 = (CardLayout) (((JButton) secondButton).getParent().getLayout());
                c1.show(((JButton) firstButton).getParent(), "Card1");
                c2.show(((JButton) secondButton).getParent(), "Card1");
                firstClick = false;
                secondClick = false;
                firstImage = null;
                secondImage = null;
            }
            if (successCount == 1) { // если открыты все карточки
                ArrayList<String[]> records;
                Records rec = new Records();// создаем экземпляр Records, конструктор которого читает файл
                records = rec.records;
                String[] myRecord = new String[]{Long.toString(Math.abs(seconds)),
                        (DateTimeFormatter.ofPattern("yyyy.MM.dd/HH:mm")).format(LocalDateTime.now()),
                        lblTime.getText()};
                records.add(myRecord); // добавляем текущий результат в список
                records.sort(Comparator.comparingInt(o -> parseInt(o[0])));//сортируем по 1 элементу массива в коллекции
                if (records.size() > 10) {// удаляем запись, если размер больше 10
                    records.remove(10);
                }
                int indexRecord = records.indexOf(myRecord);//получаем индекс текущего рекорда
                rec.writeFile(records);//записываем получившийся список в файл (класс Records)
                new Congrats(records, indexRecord, lblTime);// передаем список рекордов, индекс и значение кнопки в Congrats
            }
        }).start();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1));
        cards0 = new JPanel();
        cards0.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards0, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn0 = new JButton();
        btn0.setActionCommand("0");
        btn0.setForeground(new Color(-4473925));
        btn0.setInheritsPopupMenu(false);
        btn0.setPreferredSize(new Dimension(100, 100));
        btn0.setText("");
        cards0.add(btn0, "Card1");
        lbl0 = new JLabel();
        lbl0.setPreferredSize(new Dimension(100, 100));
        lbl0.setText("");
        cards0.add(lbl0, "Card2");
        cards1 = new JPanel();
        cards1.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn1 = new JButton();
        btn1.setActionCommand("1");
        btn1.setPreferredSize(new Dimension(100, 100));
        btn1.setText("");
        cards1.add(btn1, "Card1");
        lbl1 = new JLabel();
        lbl1.setPreferredSize(new Dimension(100, 100));
        lbl1.setText("");
        cards1.add(lbl1, "Card2");
        cards2 = new JPanel();
        cards2.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards2, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn2 = new JButton();
        btn2.setActionCommand("2");
        btn2.setPreferredSize(new Dimension(100, 100));
        btn2.setText("");
        cards2.add(btn2, "Card1");
        lbl2 = new JLabel();
        lbl2.setPreferredSize(new Dimension(100, 100));
        lbl2.setText("");
        cards2.add(lbl2, "Card2");
        cards3 = new JPanel();
        cards3.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards3, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn3 = new JButton();
        btn3.setActionCommand("3");
        btn3.setPreferredSize(new Dimension(100, 100));
        btn3.setText("");
        cards3.add(btn3, "Card1");
        lbl3 = new JLabel();
        lbl3.setPreferredSize(new Dimension(100, 100));
        lbl3.setText("");
        cards3.add(lbl3, "Card2");
        cards4 = new JPanel();
        cards4.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards4, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn4 = new JButton();
        btn4.setActionCommand("4");
        btn4.setPreferredSize(new Dimension(100, 100));
        btn4.setText("");
        cards4.add(btn4, "Card1");
        lbl4 = new JLabel();
        lbl4.setPreferredSize(new Dimension(100, 100));
        lbl4.setText("");
        cards4.add(lbl4, "Card2");
        cards5 = new JPanel();
        cards5.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards5, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn5 = new JButton();
        btn5.setActionCommand("5");
        btn5.setPreferredSize(new Dimension(100, 100));
        btn5.setText("");
        cards5.add(btn5, "Card1");
        lbl5 = new JLabel();
        lbl5.setPreferredSize(new Dimension(100, 100));
        lbl5.setText("");
        cards5.add(lbl5, "Card2");
        cards6 = new JPanel();
        cards6.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards6, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn6 = new JButton();
        btn6.setActionCommand("6");
        btn6.setPreferredSize(new Dimension(100, 100));
        btn6.setText("");
        cards6.add(btn6, "Card1");
        lbl6 = new JLabel();
        lbl6.setPreferredSize(new Dimension(100, 100));
        lbl6.setText("");
        cards6.add(lbl6, "Card2");
        cards7 = new JPanel();
        cards7.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards7, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn7 = new JButton();
        btn7.setActionCommand("7");
        btn7.setPreferredSize(new Dimension(100, 100));
        btn7.setText("");
        cards7.add(btn7, "Card1");
        lbl7 = new JLabel();
        lbl7.setPreferredSize(new Dimension(100, 100));
        lbl7.setText("");
        cards7.add(lbl7, "Card2");
        cards8 = new JPanel();
        cards8.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards8, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn8 = new JButton();
        btn8.setActionCommand("8");
        btn8.setPreferredSize(new Dimension(100, 100));
        btn8.setText("");
        cards8.add(btn8, "Card1");
        lbl8 = new JLabel();
        lbl8.setPreferredSize(new Dimension(100, 100));
        lbl8.setText("");
        cards8.add(lbl8, "Card2");
        cards9 = new JPanel();
        cards9.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards9, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn9 = new JButton();
        btn9.setActionCommand("9");
        btn9.setPreferredSize(new Dimension(100, 100));
        btn9.setText("");
        cards9.add(btn9, "Card1");
        lbl9 = new JLabel();
        lbl9.setPreferredSize(new Dimension(100, 100));
        lbl9.setText("");
        cards9.add(lbl9, "Card2");
        cards10 = new JPanel();
        cards10.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards10, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn10 = new JButton();
        btn10.setActionCommand("10");
        btn10.setPreferredSize(new Dimension(100, 100));
        btn10.setText("");
        cards10.add(btn10, "Card1");
        lbl10 = new JLabel();
        lbl10.setPreferredSize(new Dimension(100, 100));
        lbl10.setText("");
        cards10.add(lbl10, "Card2");
        cards11 = new JPanel();
        cards11.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards11, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn11 = new JButton();
        btn11.setActionCommand("11");
        btn11.setPreferredSize(new Dimension(100, 100));
        btn11.setText("");
        cards11.add(btn11, "Card1");
        lbl11 = new JLabel();
        lbl11.setPreferredSize(new Dimension(100, 100));
        lbl11.setText("");
        cards11.add(lbl11, "Card2");
        cards12 = new JPanel();
        cards12.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards12, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn12 = new JButton();
        btn12.setActionCommand("12");
        btn12.setPreferredSize(new Dimension(100, 100));
        btn12.setText("");
        cards12.add(btn12, "Card1");
        lbl12 = new JLabel();
        lbl12.setPreferredSize(new Dimension(100, 100));
        lbl12.setText("");
        cards12.add(lbl12, "Card2");
        cards13 = new JPanel();
        cards13.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards13, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn13 = new JButton();
        btn13.setActionCommand("13");
        btn13.setPreferredSize(new Dimension(100, 100));
        btn13.setText("");
        cards13.add(btn13, "Card1");
        lbl13 = new JLabel();
        lbl13.setPreferredSize(new Dimension(100, 100));
        lbl13.setText("");
        cards13.add(lbl13, "Card2");
        cards14 = new JPanel();
        cards14.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards14, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn14 = new JButton();
        btn14.setActionCommand("14");
        btn14.setPreferredSize(new Dimension(100, 100));
        btn14.setText("");
        cards14.add(btn14, "Card1");
        lbl14 = new JLabel();
        lbl14.setPreferredSize(new Dimension(100, 100));
        lbl14.setText("");
        cards14.add(lbl14, "Card2");
        cards15 = new JPanel();
        cards15.setLayout(new CardLayout(0, 0));
        rootPanel.add(cards15, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btn15 = new JButton();
        btn15.setActionCommand("15");
        btn15.setPreferredSize(new Dimension(100, 100));
        btn15.setText("");
        cards15.add(btn15, "Card1");
        lbl15 = new JLabel();
        lbl15.setPreferredSize(new Dimension(100, 100));
        lbl15.setText("");
        cards15.add(lbl15, "Card2");
        lblTime = new JLabel();
        Font lblTimeFont = this.$$$getFont$$$("Times New Roman", Font.BOLD, 20, lblTime.getFont());
        if (lblTimeFont != null) lblTime.setFont(lblTimeFont);
        lblTime.setHorizontalTextPosition(11);
        lblTime.setText("00:00");
        lblTime.setVerticalAlignment(3);
        lblTime.setVerticalTextPosition(3);
        rootPanel.add(lblTime, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 2, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}