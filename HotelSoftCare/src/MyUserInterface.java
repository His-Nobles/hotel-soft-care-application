import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class MyUserInterface extends JFrame  {
    static JPanel welcomeTopPanel, satisfactionPanel, demandPanel, blackPanel;
    JLabel emptyLabel, label1, label2, label3;
    JButton room, date, meet, food, drink;

    Font font = new Font("elephant", Font.PLAIN, 18);
Color color = new Color(140, 19, 192);

ImageIcon imageIconBACK = new ImageIcon(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("TestProject.png")))));
    public MyUserInterface() throws IOException{
        super("THE HILLSIDE HOTEL, BY CHUKA UNIVERSITY                                                 @author_mucheru_john");
        getContentPane().setBackground(Color.blue);
        setSize(1020,830);
        setLocation(160, 0);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        revalidate();
        repaint();


        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(Color.cyan);
        welcomePanel.setOpaque(true);
        welcomePanel.setPreferredSize(new Dimension(950,700));

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.add(welcomePanel);

        JLabel welcomeLabel = new JLabel("WELCOME TO HILLSIDE HOTEL CHUKA");
        welcomeLabel.setForeground(Color.red);
        welcomeLabel.setFont(new Font("wide latin", Font.BOLD, 25));

        welcomeTopPanel = new JPanel();
        welcomeTopPanel.setBackground(Color.red);
        welcomeTopPanel.add(welcomeLabel);


        welcomeLabel.repaint();
        welcomeLabel.revalidate();
        welcomeLabel.setOpaque(true);

        label1 = new JLabel("*                                  YOUR SATISFACTION IS OUR CONCERN!!                                        *");
        label1.setForeground(Color.blue);
       // label1.setBackground(Color.gray);
        label1.setOpaque(true);
        label1.setFont(new Font("elephant", Font.BOLD, 20));

        label2 = new JLabel("***Which service would you like to enjoy today?***");
        label2.setForeground(Color.darkGray);
        label2.setFont(new Font("wide latin", Font.BOLD, 20));
        label2.setBackground(Color.lightGray);
        label2.setOpaque(true);

        JPanel jogyPanel = new JPanel();

        label3 = new JLabel("<html><p>*********we are happy to serve you**********</p>");

        label3.setForeground(Color.black);
        label3.setFont(new Font("wide latin", Font.BOLD, 24));
        label3.setBackground(Color.pink);
        label3.setBorder(new LineBorder(Color.yellow));
        label3.setOpaque(true);

        jogyPanel.add(label3);

        demandPanel = new JPanel();
        demandPanel.setBackground(Color.blue);
        demandPanel.add(label2);

        satisfactionPanel = new JPanel();
        satisfactionPanel.setBackground(Color.blue);
        satisfactionPanel.add(label1);

        JPanel satisfactionDemandPanel = new JPanel();
        satisfactionDemandPanel.setBackground(Color.blue);
        satisfactionDemandPanel.setPreferredSize(new Dimension(950,100));
        satisfactionDemandPanel.add(satisfactionPanel);
        satisfactionDemandPanel.add(demandPanel);

        blackPanel = new JPanel();
        blackPanel.setPreferredSize(new Dimension(450, 300));
        blackPanel.setBackground(Color.magenta);

        JPanel blueOne = new JPanel();
        blueOne.setBackground(Color.gray.darker());
//        blueOne.add(blackPanel);

        emptyLabel = new JLabel("                                               select a service                                                       ");
        emptyLabel.setFont(font);
        emptyLabel.setForeground(Color.gray);

        JLabel emptyLabel1 = new JLabel("          our happy client, choose your preferred service");
        emptyLabel1.setFont(font);
        emptyLabel1.setForeground(color);

        JButton backBbutton = new JButton("BACK");
        backBbutton.setIcon(imageIconBACK);

        JButton backButton2 = new JButton("BACK");
        backButton2.setIcon(imageIconBACK);

        JButton backButton3 = new JButton("BACK");
        backButton3.setIcon(imageIconBACK);



        JLabel roomLabel = new JLabel("Choose a room service");
        roomLabel.setFont(new Font("Elephant", Font.BOLD, 20));

        JLabel empty2 = new JLabel("         Would you like to:     ");
        empty2.setForeground(color);
        empty2.setFont(font);

        room = new JButton("             Book a room             ");
        room.setFont(new Font("elephant", Font.PLAIN, 20));
        room.setBackground(Color.gray);
        room.setForeground(Color.green);


        JButton btnRandomRoom = new JButton("          Book a random room          ");
        btnRandomRoom.setFont(new Font("elephant", Font.PLAIN, 20));
        btnRandomRoom.setBackground(Color.BLUE);
        btnRandomRoom.setForeground(Color.GREEN);

        JButton btnFloorOrder = new JButton("Book according to flow number");
        btnFloorOrder.setFont(new Font("elephant", Font.PLAIN, 20));
        btnFloorOrder.setBackground(Color.BLUE);
        btnFloorOrder.setForeground(Color.GREEN);

        JLabel empty3 = new JLabel("system will search available room for you!");
        empty3.setFont(new Font("elephant", Font.PLAIN, 12));
        empty3.setForeground(color);

        btnRandomRoom.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();



            backButton2.addActionListener(e13 -> {
               blackPanel.removeAll();
               blackPanel.revalidate();
               blackPanel.repaint();

               demandPanel.removeAll();
               demandPanel.revalidate();
               demandPanel.repaint();

               demandPanel.add(backBbutton);
               demandPanel.add(roomLabel);

               blackPanel.add(empty2);
               blackPanel.add(btnRandomRoom);
               blackPanel.add(btnFloorOrder);
            });
            demandPanel.remove(backBbutton);
            demandPanel.add(backButton2);
            demandPanel.remove(label2);
            demandPanel.add(roomLabel);

            blackPanel.add(empty3);
            JOptionPane.showMessageDialog(blackPanel, "searching available rooms for you, please be patient");
            Random rad = new Random();
            int room = rad.nextInt(65) + 1;
            int floor = rad.nextInt(4) + 1;
            JLabel roomFound, roomnumber, receipt;
                    roomFound = new JLabel("                                         A room was found, ROOM                               ");
                    roomFound.setFont(new Font("MS Gothic", Font.PLAIN, 12));
                    roomFound.setForeground(Color.white);
                    roomnumber = new JLabel( "                "+room +"'     on floor number, FLOOR '"+floor+"'                       ");
                    roomnumber.setForeground(Color.white);
                    roomnumber.setFont(new Font("MS Gothic", Font.PLAIN, 12));
                    receipt = new JLabel("                   feel free to print your receipt                         ");
                    receipt.setFont(new Font("MS Gothic", Font.PLAIN, 12));
                    receipt.setForeground(Color.white);


            JButton printButton = new JButton("PRINT RECEIPT");
            printButton.setForeground(Color.BLACK);
            printButton.setBackground(Color.green);
            printButton.setSize(30,30);

            blackPanel.revalidate();
            blackPanel.repaint();

            blackPanel.add(roomFound);
            blackPanel.add(roomnumber);
            blackPanel.add(receipt);
            blackPanel.add(printButton);

        });

        btnFloorOrder.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();


            backButton3.addActionListener(e14 -> {
                demandPanel.removeAll();
                demandPanel.revalidate();
                demandPanel.repaint();

                demandPanel.add(backBbutton);
                demandPanel.add(roomLabel);

                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                blackPanel.add(empty2);
                blackPanel.add(btnRandomRoom);
                blackPanel.add(btnFloorOrder);


            });

            JLabel chooseFloor = new JLabel("Enter your preferred floor:                ");
            chooseFloor.setFont(new Font("elephant", Font.PLAIN, 20));
            chooseFloor.setForeground(Color.cyan);
            JTextField Floor = new JTextField();
            Floor.setPreferredSize(new Dimension(100, 25));

            JButton move = new JButton("lets go");
            move.addActionListener(e18 -> {




                try {
                    int customerChoice = Integer.parseInt(Floor.getText());
                    JOptionPane.showMessageDialog(null, "you chose floor number: "+ customerChoice + " system is looking for available room on  that floor");

                    int room = new Random().nextInt(20)+1;

                    JLabel label, label1, label2;

                    label = new JLabel("                       available room on floor "+customerChoice+"               ");
                    label.setForeground(color);
                    label.setFont(font);

                    label1 = new JLabel("                             is room number: "+ room + "                           ");
                    label1.setFont(font);
                    label1.setForeground(color);

                    label2 = new JLabel("                   feel free to print your room booking receipt");
                    label2.setForeground(color);
                    label2.setFont(font);
                    JButton printButton = new JButton("PRINT RECEIPT");
                    printButton.setForeground(Color.BLACK);
                    printButton.setBackground(Color.green);
                    printButton.setSize(30,30);

                    printButton.addActionListener(e15 -> {
                        blackPanel.removeAll();
                        blackPanel.revalidate();
                        blackPanel.repaint();

                        String message = "<html>"+
                                "<p> your receipt was printed</p>"+
                                "<p> thank you for choosing</p> "+
                                "<p> hilliside hotel by </p>"+
                                "<p>chuka university</p>"+
                                "<p>knowledge is wealth</p>"+
                                "<p> please check the console"+
                                "</html>";
                        JLabel lastPrint = new JLabel(message);
                        lastPrint.setForeground(color);
                        lastPrint.setFont(font);

                        blackPanel.add(lastPrint);
                        blackPanel.add(new JButton("HOME"));

                        System.out.println("           thank you for choosing the hillside hotel chuka ");
                        System.out.println("                         you picked a room "+ room);
                        System.out.println("                         on floor "+ customerChoice);
                        System.out.println("                         please give this receipt to the reception");
                        System.out.println("                         have a blessed stay in the hillside hotel    ");
                        System.out.println("                         THANK YOU! AGAIN FOR CHOOSING US");
                        System.out.println("press the home button on the fore screen to order more in room services ");

                    });

                    blackPanel.removeAll();
                    blackPanel.revalidate();
                    blackPanel.repaint();


                    blackPanel.add(label);
                    blackPanel.add(label1);
                    blackPanel.add(label2);
                    blackPanel.add(printButton);
                }
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(blackPanel, "enter a number between 1-4");

                    }

                });

            demandPanel.removeAll();
            demandPanel.revalidate();
            demandPanel.repaint();
            demandPanel.add(backButton3);
            demandPanel.add(roomLabel);
            blackPanel.add(chooseFloor);
            blackPanel.add(Floor);
            blackPanel.add(move);

        });

        room.addActionListener(e -> {

            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();

            backBbutton.addActionListener(e16 -> {

                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                demandPanel.removeAll();
                demandPanel.revalidate();
                demandPanel.repaint();
                demandPanel.add(label2);

                blackPanel.add(emptyLabel1);
                blackPanel.add(room);
                blackPanel.add(meet);
                blackPanel.add(date);
                blackPanel.add(food);
                blackPanel.add(drink);

            });



            demandPanel.remove(label2);
            demandPanel.add(backBbutton);
            demandPanel.add(roomLabel);
            blackPanel.add(empty2);
            blackPanel.add(btnRandomRoom);
            blackPanel.add(btnFloorOrder);


        });

        meet = new JButton("Book a meeting table/tent");
        meet.setFont(new Font("elephant", Font.PLAIN, 20));
        meet.setBackground(Color.gray);
        meet.setForeground(Color.GREEN);

        meet.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();

            JButton privateTable, publicTable, tent;
            privateTable = new JButton("Book business class('private') 5-12 members");
            privateTable.setFont(new Font("elephant", Font.PLAIN, 15));
            privateTable.setBackground(Color.BLUE);
            privateTable.setForeground(Color.green);

            publicTable = new JButton("Book economy class('non-private') 12-20 members");
            publicTable.setFont(new Font("elephant", Font.PLAIN, 15));
            publicTable.setBackground(Color.BLUE);
            publicTable.setForeground(Color.green);

            tent = new JButton("Book a day with us('comes with 2 tents, vip and members')");
            tent.setFont(new Font("elephant", Font.PLAIN, 15));
            tent.setBackground(Color.BLUE);
            tent.setForeground(Color.green);

            publicTable.addActionListener(e19 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                blackPanel.setBackground(Color.red);

                JOptionPane.showMessageDialog(null, "you are booking an economy class('non-private') 12-20 members, Cost 200/- per min");
              boolean go = false;
              while(!go) {
                  try {
                      String name = JOptionPane.showInputDialog(null, "please enter your date for the meeting");
                      if (name==null){
                          blackPanel.repaint();
                          blackPanel.validate();

                          blackPanel.add(privateTable);
                          blackPanel.add(publicTable);
                          blackPanel.add(tent);
                      break;
                      }
                      String time =  (JOptionPane.showInputDialog(null, "please enter the period of time you would like to spend with us"));
                      if (time == null){
                          blackPanel.repaint();
                          blackPanel.revalidate();
                          blackPanel.setBackground(Color.yellow);
                          blackPanel.add(privateTable);
                          blackPanel.add(publicTable);
                          blackPanel.add(tent);
                      }
                     else if (time.trim().isEmpty()){
                          JOptionPane.showMessageDialog(blackPanel, "please enter a number value. can't be empty!!");

                          continue;
                     }

                      assert time != null;
                      int realtime = Integer.parseInt(time);

                      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                      Date date_2 = simpleDateFormat.parse(name);

                      int cost = realtime*200*60;
                      JLabel label0, label11, label2, label3;
                      label0 = new JLabel("            you have successfully booked a public economy class table on              ");
                      label11 = new JLabel("                    "+date_2+" for a period of "+time+"hrs                            " );
                      label2= new JLabel("                 Your discounted price for "+time+"hrs will be "+cost+"/-              ");
                      label3 = new JLabel("                                WE APPRECIATE YOUR TRUST                              ");
                      label3.setFont(new Font("elephant", Font.BOLD,10));

                      JButton printButton = new JButton("PRINT RECEIPT");
                      printButton.setForeground(Color.green);
                      printButton.setBackground(Color.red);
                      printButton.setSize(30,30);

                      blackPanel.removeAll();
                      blackPanel.revalidate();
                      blackPanel.repaint();


                      getContentPane().setBackground(Color.lightGray);
                      satisfactionPanel.setBackground(Color.green);
                      label1.setForeground(Color.green);
                      welcomeTopPanel.setBackground(Color.yellow);
                      welcomePanel.setBackground(Color.orange);
                      blackPanel.setBackground(Color.yellow);
                      blackPanel.setLayout(new FlowLayout());
                      blackPanel.add(label0);
                      blackPanel.add(label11);
                      blackPanel.add(label2);
                      blackPanel.add(label3);
                      blackPanel.add(printButton);

                      go = true;

                  } catch (NumberFormatException ex) {
                      JOptionPane.showMessageDialog(null, "Invalid period input, please enter valid period in 'hrs!'");
                  } catch (Exception e1) {
                      JOptionPane.showMessageDialog(null, "Invalid date input, please enter date inform \"dd-MM-yyyy\"");
                  }
              }
            });

            privateTable.addActionListener(e110 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

               int choice = JOptionPane.showConfirmDialog(null, "you are booking a business class meeting tables\n" +
                        "this will cost you Ksh.500 per minute, click yes to proceed");
                if (choice == JOptionPane.YES_OPTION) {
                    blackPanel.setBackground(Color.red);
                    String userDate = JOptionPane.showInputDialog(null, "Please enter the date for your meet(YYYY-MM-DD)");

                    JLabel newLabel = null, nextLabel = null, netlabel = null;
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date date = simpleDateFormat.parse(userDate);
                        int time = 0;
                        try {
                            time = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the period of time you will take in hrs"));
                        } catch (NumberFormatException U) {
                            JOptionPane.showMessageDialog(null, " Enter a real period");
                        }
                        int money = time * 500 * 60;
                        newLabel = new JLabel(" you have successfully booked a private table on " + date);
                        nextLabel = new JLabel(" for " + time + "hrs you will have to pay Ksh." + money );
                        netlabel = new JLabel("THANK YOU FOR TRUSTING IN US");
                    } catch (ParseException ex) {
                        // throw new RuntimeException(ex);
                        JOptionPane.showMessageDialog(null, "Invalid date format. please use 'YYYY-MM-DD'");

                    }
                    JButton printButton = new JButton("PRINT RECEIPT");
                    printButton.setForeground(Color.BLACK);
                    printButton.setBackground(Color.green);
                    printButton.setSize(30,30);

                    blackPanel.revalidate();
                    blackPanel.repaint();
                    blackPanel.add(newLabel);
                    blackPanel.add(nextLabel);
                    blackPanel.add(netlabel);
                    blackPanel.add(printButton);


                } else if (choice == JOptionPane.NO_OPTION) {

                    blackPanel.revalidate();
                    blackPanel.repaint();

                    blackPanel.add(privateTable);
                    blackPanel.add(publicTable);
                    blackPanel.add(tent);

                } else if (choice == JOptionPane.CANCEL_OPTION) {
                    blackPanel.revalidate();
                    blackPanel.repaint();

                    blackPanel.add(room);
                    blackPanel.add(meet);
                    blackPanel.add(date);
                    blackPanel.add(drink);
                    blackPanel.add(food);

                }
            });

            tent.addActionListener(e111 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                String infoText = "<html>"+
                        "                     <p>The hillside Hotel chuka provide advanced high class ceremonies services</p>"+
                        "                     <p>such as wedding, graduation, family affairs and many more</p>" +
                        "                     <p>kids aren't left behind with bouncing castles, swimming and many more</p>"+
                        "                     <p>The hillside hotel chuka is absolutely the best place to have a ceremony</p>"+
                        "</html>";

                JLabel infoLabel = new JLabel(infoText);
                infoLabel.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 20));
                infoLabel.setForeground(color);

                JButton okayButton = new JButton("OKAY");
                okayButton.setForeground(Color.green);
                okayButton.setBackground(Color.red);
                okayButton.setFont(new Font("castellar", Font.PLAIN,20));

                okayButton.addActionListener(e1111 -> {
                    blackPanel.removeAll();
                    blackPanel.revalidate();
                    blackPanel.repaint();

                    blackPanel.setBackground(Color.green);
                    welcomePanel.setBackground(Color.magenta);
                    getContentPane().setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "your booking was successful. THANK YOU");

                    blackPanel.revalidate();
                    blackPanel.repaint();
                    blackPanel.setBackground(Color.darkGray);
                    blackPanel.add(room);
                    blackPanel.add(meet);
                    blackPanel.add(date);
                    blackPanel.add(drink);
                    blackPanel.add(food);
                });

                blackPanel.add(infoLabel);
                blackPanel.add(okayButton);

            });

            backButton3.addActionListener(e112 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                demandPanel.removeAll();
                demandPanel.revalidate();
                demandPanel.repaint();

                demandPanel.add(label2);

                blackPanel.add(room);
                blackPanel.add(meet);
                blackPanel.add(date);
                blackPanel.add(drink);
                blackPanel.add(food);

            });
            JLabel meetLabel = new JLabel("chose you meeting category");
            meetLabel.setFont(new Font("Elephant", Font.BOLD, 20));

            demandPanel.removeAll();
            demandPanel.revalidate();
            demandPanel.repaint();
            demandPanel.add(backButton3);
            demandPanel.add(meetLabel);

            blackPanel.add(privateTable);
            blackPanel.add(publicTable);
            blackPanel.add(tent);
        });

        date = new JButton("        Book for couples          ");
        date.setFont(new Font("elephant", Font.PLAIN, 20));
        date.setBackground(Color.gray);
        date.setForeground(Color.GREEN);

        date.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();

            String info = "<html>"+
                    "<p>WelCome to Hillside Hotel</p>"+
                    "<p>this Hotel support love vigilantly</p>"+
                    "<p>we will receive your choice and decorate</p> <p>your table with roses for you</p>"+
                    "</html>";

            JButton okay = new JButton("sweet");

            okay.addActionListener(e17 -> {
                blackPanel.removeAll();
                blackPanel.repaint();
                blackPanel.revalidate();

                JButton out, in, outpriv, inpriv;

                JLabel label = new JLabel("              would you like to?             ");
                label.setForeground(Color.gray);
                label.setFont(new Font("elephant",Font.BOLD, 20));

                out = new JButton("               Stay outside tables                 ");
                in = new JButton("                stay inside  tables                 ");
                outpriv = new JButton("            stay outside in private set up        ");
                inpriv = new JButton("             stay inside in private set up         ");

                out.addActionListener(e1712 -> {
                    blackPanel.removeAll();
                    blackPanel.repaint();
                    blackPanel.revalidate();

                    JButton done = new JButton("Done");
                    done.addActionListener(e171 -> {
                        Color newcolor = JColorChooser.showDialog(blackPanel, "choose your favorite color",  blackPanel.getBackground());
                   if (newcolor != null){
                       getContentPane().setBackground(newcolor);
                   }

                    });
                    blackPanel.add(done);
                });

                blackPanel.add(label);
                blackPanel.add(out);
                blackPanel.add(in);
                blackPanel.add(outpriv);
                blackPanel.add(inpriv);

            });
            JLabel label = new JLabel(info);
            label.setForeground(Color.green);
            label.setFont(new Font("Forte", Font.BOLD,20));

            blackPanel.setBackground(Color.red);
            blackPanel.add(label);
            blackPanel.add(okay);

        });

        food = new JButton("               Order food                ");
        food.setFont(new Font("elephant", Font.PLAIN, 20));
        food.setBackground(Color.gray);
        food.setForeground(Color.GREEN);

        food.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();

            String[] buttonText = {"Filet mignon", "Lobster thermidor", "Alfresh fli", " instant hunger",
                    "Chips mwitu", "chapo fli", "ndegu mukimo", "mukimo chapo", "waru thige", "mituru"};

            blackPanel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(2, 4, 2, 4); // Margin around components
            gbc.anchor = GridBagConstraints.WEST;

            for (int i = 0; i < 10; i++) {
                gbc.gridx = 0; // First column for labels
                gbc.gridy = i; // Row, one for each label/button pair
                JLabel label = new JLabel(""+(i + 1));
                blackPanel.add(label, gbc);

                gbc.gridx = 1; // Second column for buttons
                JButton button = new JButton(buttonText[i]);
                blackPanel.add(button, gbc);
            }
        });

//           food.addActionListener( e -> {
//            blackPanel.removeAll();
//            blackPanel.revalidate();
//            blackPanel.repaint();
//
//            Color color = new Color(0,0,255);
//            Color color1 = new Color(0,0, 0);
//            Font font = new Font("Bernard MT Condensed",Font.BOLD, 20);
//
//                JButton food0, food1, food2, food3, food4, food5, food6, food7, food8, food9;
//                JLabel label1, label2, label3, label01,label4,label5, label6, label7, label8, label9;
//
//                label01 = new JLabel("1.");
//                label01.setForeground(color1);
//                label01.setFont(font);
//                label01.setBackground(color);
//
//                label1 = new JLabel("2.");
//                label1.setForeground(color1);
//                label1.setFont(font);
//                label1.setBackground(color);
//
//                label2 = new JLabel("3.");
//                label2.setForeground(color1);
//                label2.setFont(font);
//                label2.setBackground(color);
//
//                label3= new JLabel("4.");
//                label3.setForeground(color1);
//                label3.setFont(font);
//                label3.setBackground(color);
//
//                label4= new JLabel("5.");
//                label4.setForeground(color1);
//                label4.setFont(font);
//                label4.setBackground(color);
//
//                label5= new JLabel("6.");
//                label5.setForeground(color1);
//                label5.setFont(font);
//                label5.setBackground(color);
//
//                label6= new JLabel("7.");
//                label6.setForeground(color1);
//                label6.setFont(font);
//                label6.setBackground(color);
//
//                label7= new JLabel("8.");
//                label7.setForeground(color1);
//                label7.setFont(font);
//                label7.setBackground(color);
//
//                label8= new JLabel("9.");
//                label8.setForeground(color1);
//                label8.setFont(font);
//                label8.setBackground(color);
//
//                label9 = new JLabel("10..");
//                label9.setForeground(color1);
//                label9.setFont(font);
//                label9.setBackground(color);
//
//
//                food0 = new JButton(        "  Filet Mignon                                       .         ");
//                food0.setBackground(color);
//                food0.setForeground(color1);
//                food0.setFont(font);
//
//                food1  = new JButton(       "  Lobster Thermidor                          .        " );
//                food1.setBackground(color);
//                food1.setForeground(color1);
//                food1.setFont(font);
//
//                food2  = new JButton(       "  truffle Risotto                            .          " );
//                food2.setBackground(color);
//                food2.setForeground(color1);
//                food2.setFont(font);
//
//                food3  = new JButton(       "  Seared Foie Gras                             .        " );
//                food3.setBackground(color);
//                food3.setForeground(color1);
//                food3.setFont(font);
//
//                food4  = new JButton(       "  Suchi and Sachini Platter                             " );
//                food4.setBackground(color);
//                food4.setForeground(color1);
//                food4.setFont(font);
//
//                food5  = new JButton(       "  Duck a I'Orange                                      " );
//                food5.setBackground(color);
//                food5.setForeground(color1);
//                food5.setFont(font);
//
//                food6  = new JButton(       "  Caviar and Blini                                          " );
//                food6.setBackground(color);
//                food6.setForeground(color1);
//                food6.setFont(font);
//
//                food7  = new JButton(       "  Creme Brulee                                        " );
//                food7.setBackground(color);
//                food7.setForeground(color1);
//                food7.setFont(font);
//
//                food8  = new JButton(       "  Peking Duck                                            " );
//                food8.setBackground(color);
//                food8.setForeground(color1);
//                food8.setFont(font);
//
//                food9  = new JButton(       "  ChateauBrand Steak);                                  ");
//                food9.setBackground(color);
//                food9.setForeground(color1);
//                food9.setFont(font);
//
//                JLabel label = new JLabel("                    Advanced meal for a 5 star hotel✡✡✡✡✡                          ");
//                label.setFont(new Font("castellar", Font.PLAIN, 20));
//
//                getContentPane().setBackground(new Color(85, 107, 9));
//                welcomeTopPanel.setBackground(Color.green);
//                welcomePanel.setBackground(Color.red);
//
//                GridBagConstraints gbc = new GridBagConstraints();
//                gbc.insets = new Insets(4, 4, 4, 4); // Margin around components
//                gbc.gridx = 0;
//                gbc.gridy = 0;
//                gbc.anchor = GridBagConstraints.WEST;
//
//
//                blackPanel.setLayout(new GridBagLayout());
//                blackPanel.setBackground(new Color(128,128,0));
//
//                blackPanel.add(label, gbc);
//
//                JScrollPane scrollPane  = new JScrollPane();
//                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//               blackPanel.add(scrollPane);
//
//                gbc.gridy = 1;
//                gbc.gridx = 0;
//                blackPanel.add( label01 , gbc);
//                gbc.gridy = 1;
//                gbc.gridx = 1;
//            blackPanel.add(food0, gbc);
//                gbc.gridy = 1;
//                gbc.gridx = 0;
//                blackPanel.add(label1 );
//                gbc.gridy = 2;
//                gbc.gridx = 1;
//            blackPanel.add(food1);
//                gbc.gridy = 3;
//                gbc.gridx = 0;
//                blackPanel.add(label2 );
//                gbc.gridy = 3;
//                gbc.gridx = 1;
//            blackPanel.add(food2);
//                gbc.gridy = 4;
//                gbc.gridx = 0;
//                blackPanel.add(label3 );
//                gbc.gridy = 4;
//                gbc.gridx = 1;
//            blackPanel.add(food3);
//                gbc.gridy = 5;
//                gbc.gridx = 0;
//                blackPanel.add(label4 );
//                gbc.gridy = 5;
//                gbc.gridx = 1;
//            blackPanel.add(food4);
//                gbc.gridy = 6;
//                gbc.gridx = 0;
//                blackPanel.add(label5 );
//                gbc.gridy = 6;
//                gbc.gridx = 1;
//            blackPanel.add(food5);
//                gbc.gridy = 7;
//                gbc.gridx = 0;
//                blackPanel.add( label6);
//                gbc.gridy = 7;
//                gbc.gridx = 1;
//            blackPanel.add(food6);
//                gbc.gridy = 8;
//                gbc.gridx = 0;
//                blackPanel.add( label7);
//                gbc.gridy = 8;
//                gbc.gridx = 1;
//            blackPanel.add(food7);
//                gbc.gridy = 9;
//                gbc.gridx = 0;
//                blackPanel.add(label8);
//                gbc.gridy = 9;
//                gbc.gridx = 1;
//            blackPanel.add(food8);
//                gbc.gridy = 10;
//                gbc.gridx = 0;
//                blackPanel.add( label9);
//                gbc.gridy = 10;
//                gbc.gridx = 1;
//            blackPanel.add(food9);
//            //            blackPanel.add(scrollPane);
//
//        });

        drink = new JButton("             Order drink               ");
        drink.setFont(new Font("elephant", Font.PLAIN, 20));
        drink.setBackground(Color.gray);
        drink.setForeground(Color.GREEN);

        drink.addActionListener(e -> {
            blackPanel.removeAll();
            blackPanel.revalidate();
            blackPanel.repaint();

            final JButton[] drink0 = new JButton[1];
            final JButton[] j1 = new JButton[1];
            final JButton[] j2 = new JButton[1];
            final JButton[] j3 = new JButton[1];
            final JButton[] j4 = new JButton[1];
//            final JButton[] drink1 = new JButton[1];
//            final JButton[] drink2 = new JButton[1];
//            final JButton[] drink3 = new JButton[1];
//            final JButton[] drink4 = new JButton[1];
//            final JButton[] drink5 = new JButton[1];
//            final JButton[] drink6 = new JButton[1];


            Color color1 = new Color(12,12,12);
            Color color2 = new Color(192,192,192);

            JLabel label = new JLabel("Best Quality drinks for our 5 star");
            label.setFont(new Font("castellar", Font.PLAIN, 20));

            JButton cockTails, Wines, bears, softdrinks, sodas, mockTails, non_alcoholic;

            cockTails = new JButton("CockTails");
            cockTails.setBackground(color2);

            cockTails.addActionListener(e113 -> {


                JLabel drinkLabel = new JLabel("Here are Top cockTail drink:");


                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                drink0[0] = new JButton(        "Martini:");
                drink0[0].setBackground(color);
                drink0[0].setForeground(color1);
                drink0[0].setFont(font);

                j1[0] = new JButton("Margarita");
                j1[0].setBackground(color);
                j1[0].setForeground(color1);
                j1[0].setFont(font);

                j2[0] = new JButton("Old Fashioned:");
                j2[0].setBackground(color);
                j2[0].setForeground(color1);
                j2[0].setFont(font);

                j3[0] = new JButton("Piña Colada:");
                j3[0].setBackground(color);
                j3[0].setForeground(color1);
                j3[0].setFont(font);

                j4[0] = new JButton("Moscow Mule:");
                j4[0].setBackground(color);
                j4[0].setForeground(color1);
                j4[0].setFont(font);

                blackPanel.add(drinkLabel);
                blackPanel.add(j1[0]);
                blackPanel.add(j2[0]);
                blackPanel.add(j3[0]);
                blackPanel.add(j4[0]);


            });

            Wines = new JButton("Wines");
            Wines.setBackground(color2);

            Wines.addActionListener(e12 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JLabel WinesLabel = new JLabel("Best wines in town:");

                JButton drink, dri, dri1, dri2, dri3, dri4;

                drink = new JButton(       "MolassesTo" );
                drink.setBackground(color);
                drink.setForeground(color1);
                drink.setFont(font);

                dri = new JButton("antimatterLi");
                dri.setBackground(color);
                dri.setForeground(color1);
                dri.setFont(font);

                dri1 = new JButton("Humanizer");
                dri1.setBackground(color);
                dri1.setForeground(color1);
                dri1.setFont(font);

                dri2 = new JButton("buyerD'z");
                dri2.setBackground(color);
                dri2.setForeground(color1);
                dri2.setFont(font);

                dri3 = new JButton("blackthorn");
                dri3.setBackground(color);
                dri3.setForeground(color1);
                dri3.setFont(font);

                dri4 = new JButton("MuncherDrink");
                dri4.setBackground(color);
                dri4.setForeground(color1);
                dri4.setFont(font);

                blackPanel.add(WinesLabel);
                blackPanel.add(drink);
                blackPanel.add(dri);
                blackPanel.add(dri1);
                blackPanel.add(dri2);
                blackPanel.add(dri3);
                blackPanel.add(dri4);

            });

            bears = new JButton("Bears");
            bears.setBackground(color2);

            bears.addActionListener(e114 -> {

                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JButton drinkp, drin,drin1,drin2,drin3,drin4;

                JLabel BearsLabel = new JLabel("Best bears! Best life! Best Living");

                drinkp = new JButton(       " Tucker-Lager    " );
                drinkp.setBackground(color);
                drinkp.setForeground(color1);
                drinkp.setFont(font);

                drin = new JButton("Black and white");
                drin.setBackground(color);
                drin.setForeground(color1);
                drin.setFont(font);

                drin1 = new JButton("Quickness-Best ");
                drin1.setBackground(color);
                drin1.setForeground(color1);
                drin1.setFont(font);

                drin2 = new JButton("John-Walker");
                drin2.setBackground(color);
                drin2.setForeground(color1);
                drin2.setFont(font);

                drin3 = new JButton("Whisky.Org" );
                drin3.setBackground(color);
                drin3.setForeground(color1);
                drin3.setFont(font);

                drin4 = new JButton("Mantis");
                drin4.setBackground(color);
                drin4.setForeground(color1);
                drin4.setFont(font);

                blackPanel.add(BearsLabel);
                blackPanel.add(drinkp);
                blackPanel.add(drin);
                blackPanel.add(drin1);
                blackPanel.add(drin2);
                blackPanel.add(drin3);
                blackPanel.add(drin4);

            });

            softdrinks = new JButton("SoftDrinks");
            softdrinks.setBackground(color2);

            softdrinks.addActionListener(e115 -> {

                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JLabel softDrinkLabel = new JLabel("Best quality softdrink");

                JButton drinkt, j11, j21, j31, j41, j5;

                drinkt = new JButton(       "   drink   " );
                drinkt.setBackground(color);
                drinkt.setForeground(color1);
                drinkt.setFont(font);

                j11 = new JButton("Black and white");
                j11.setBackground(color);
                j11.setForeground(color1);
                j11.setFont(font);

                j21 = new JButton("Quickness-Best ");
                j21.setBackground(color);
                j21.setForeground(color1);
                j21.setFont(font);

                j31 = new JButton("John-Walker");
                j31.setBackground(color);
                j31.setForeground(color1);
                j31.setFont(font);

                j41 = new JButton("Whisky.Org" );
                j41.setBackground(color);
                j41.setForeground(color1);
                j41.setFont(font);

                j5 = new JButton("Mantis");
                j5.setBackground(color);
                j5.setForeground(color1);
                j5.setFont(font);


                blackPanel.add(softDrinkLabel);
                blackPanel.add(drinkt);
                blackPanel.add(j11);
                blackPanel.add(j21);
                blackPanel.add(j31);
                blackPanel.add(j41);
                blackPanel.add(j5);

            });

            sodas = new JButton("Sodas");
            sodas.setBackground(color2);

            sodas.addActionListener(e116 -> {

                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JLabel sodaLabel = new JLabel("Enjoying the best of Coca-cola Company!");
                JButton drinky, j112, j212, j312, j412, j5;



                drinky = new JButton(       "   drink   " );
                drinky.setBackground(color);
                drinky.setForeground(color1);
                drinky.setFont(font);

                j112 = new JButton("Black and white");
                j112.setBackground(color);
                j112.setForeground(color1);
                j112.setFont(font);

                j212 = new JButton("Quiness-Best ");
                j212.setBackground(color);
                j212.setForeground(color1);
                j212.setFont(font);

                j312 = new JButton("John-Walker");
                j312.setBackground(color);
                j312.setForeground(color1);
                j312.setFont(font);

                j412 = new JButton("Whisky.Org" );
                j412.setBackground(color);
                j412.setForeground(color1);
                j412.setFont(font);

                j5 = new JButton("Mantis");
                j5.setBackground(color);
                j5.setForeground(color1);
                j5.setFont(font);

                blackPanel.add(sodaLabel);
                blackPanel.add(drinky);
                blackPanel.add(j112);
                blackPanel.add(j212);
                blackPanel.add(j312);
                blackPanel.add(j412);
                blackPanel.add(j5);
            });

            mockTails = new JButton("MockTails");
            mockTails.setBackground(color2);

            mockTails.addActionListener(e117 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JLabel mockTailsLabel = new JLabel("MockTails by kavagara company");
                JButton drinku, j113, j213, j313, j413, j5;

                drinku = new JButton(       "  drink    " );
                drinku.setBackground(color);
                drinku.setForeground(color1);
                drinku.setFont(font);

                j113 = new JButton("Black and white");
                j113.setBackground(color);
                j113.setForeground(color1);
                j113.setFont(font);

                j213 = new JButton("Quiness-Best ");
                j213.setBackground(color);
                j213.setForeground(color1);
                j213.setFont(font);

                j313 = new JButton("John-Walker");
                j313.setBackground(color);
                j313.setForeground(color1);
                j313.setFont(font);

                j413 = new JButton("Whisky.Org" );
                j413.setBackground(color);
                j413.setForeground(color1);
                j413.setFont(font);

                j5 = new JButton("Mantis");
                j5.setBackground(color);
                j5.setForeground(color1);
                j5.setFont(font);

                blackPanel.add(mockTailsLabel);
                blackPanel.add(drinku);
                blackPanel.add(j113);
                blackPanel.add(j213);
                blackPanel.add(j313);
                blackPanel.add(j413);
                blackPanel.add(j5);

            });

            non_alcoholic = new JButton("Non-Alcoholics");
            non_alcoholic.setBackground(color2);

            non_alcoholic.addActionListener(e118 -> {
                blackPanel.removeAll();
                blackPanel.revalidate();
                blackPanel.repaint();

                JLabel non_alcoholicLabel = new JLabel("Best drinks ");
                JButton drinkg, j114, j214, j314, j414, j5;

                drinkg = new JButton(       " drink     " );
                drinkg.setBackground(color);
                drinkg.setForeground(color1);
                drinkg.setFont(font);

                j114 = new JButton("Black and white");
                j114.setBackground(color);
                j114.setForeground(color1);
                j114.setFont(font);

                j214 = new JButton("Quiness-Best ");
                j214.setBackground(color);
                j214.setForeground(color1);
                j214.setFont(font);

                j314 = new JButton("John-Walker");
                j314.setBackground(color);
                j314.setForeground(color1);
                j314.setFont(font);

                j414 = new JButton("Whisky.Org" );
                j414.setBackground(color);
                j414.setForeground(color1);
                j414.setFont(font);

                j5 = new JButton("Mantis");
                j5.setBackground(color);
                j5.setForeground(color1);
                j5.setFont(font);

                blackPanel.add(non_alcoholicLabel);
                blackPanel.add(drinkg);
                blackPanel.add(j114);
                blackPanel.add(j214);
                blackPanel.add(j314);
                blackPanel.add(j414);
                blackPanel.add(j5);

            });

            blackPanel.add(cockTails);
            blackPanel.add(Wines);
            blackPanel.add(bears);
            blackPanel.add(softdrinks);
            blackPanel.add(sodas);
            blackPanel.add(non_alcoholic);

        });

        blackPanel.add(emptyLabel);
        blackPanel.add(room);
        blackPanel.add(meet);
        blackPanel.add(date);
        blackPanel.add(food);
        blackPanel.add(drink);

         JButton jogyJogy = new JButton("click me");

        jogyJogy.setSize(new Dimension( 10, 10));

        BufferedImage bufferedImage = null;
        try {
           // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImage = ImageIO.read(new File("hotel room1.jpeg"));
      if (bufferedImage==null){
          throw new IOException("no image found man!😀😀📸😂, nakuona");
      }
        }catch (IOException e){
            e.printStackTrace();
        }
        int targetWidth = 200;
        int targetHeight = 200;
        BufferedImage newImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = newImage.createGraphics();
        graphics2D.drawImage(bufferedImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();

        ImageIcon pictureImage = new ImageIcon(newImage);
        JLabel picture = new JLabel(pictureImage);

        BufferedImage bufferedImagee = null;
        try {
            // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImagee = ImageIO.read(new File("couplestables.jpeg"));
            if (bufferedImagee==null){
                throw new IOException("no image found man!😀😀📸😂, nakuona");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        int targetWidthe = 240;
        int targetHeighte = 200;
        BufferedImage newImagee = new BufferedImage(targetWidthe, targetHeighte, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2De = newImagee.createGraphics();
        graphics2De.drawImage(bufferedImagee, 0, 0, targetWidthe, targetHeighte, null);
        graphics2De.dispose();

        ImageIcon photoo = new ImageIcon(newImagee);
        JLabel photo = new JLabel(photoo);

        BufferedImage bufferedImage3 = null;
        try {
            // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImage3 = ImageIO.read(new File("hotel room2.jpeg"));
            if (bufferedImage3==null){
                throw new IOException("no image found man!😀😀📸😂, nakuona");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        int targetWidth3 = 200;
        int targetHeight3 = 200;
        BufferedImage newImage3 = new BufferedImage(targetWidth3, targetHeight3, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D3 = newImage3.createGraphics();
        graphics2D3.drawImage(bufferedImage3, 0, 0, targetWidth3, targetHeight3, null);
        graphics2D3.dispose();

        ImageIcon iconphotos = new ImageIcon(newImage3);
        JLabel photos = new JLabel(iconphotos);

        BufferedImage bufferedImage4 = null;
        try {
            // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImage4 = ImageIO.read(new File("couples.jpeg"));
            if (bufferedImage4==null){
                throw new IOException("no image found man!😀😀📸😂, nakuona");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        int targetWidth4 = 240;
        int targetHeight4 = 200;
        BufferedImage newImage4 = new BufferedImage(targetWidth4, targetHeight4, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D4 = newImage4.createGraphics();
        graphics2D4.drawImage(bufferedImage4, 0, 0, targetWidth4, targetHeight4, null);
        graphics2D4.dispose();

        ImageIcon icon4 = new ImageIcon(newImage4);
        JLabel labelLabel = new JLabel(icon4);


         jogyJogy.setFont(new Font("castella", Font.BOLD, 25));
         jogyJogy.setBackground(Color.black);
         jogyJogy.setForeground(Color.RED);
         jogyPanel.add(jogyJogy);

        final int[] joger = {0};

         jogyJogy.addActionListener(e -> {

             joger[0]++;

             if (joger[0] == 10){
                  joger[0] = 0;
              }
              switch (joger[0]){
                  case 0:
                      //action colors for the main panels
                      getContentPane().setBackground(Color.WHITE);
                      welcomePanel.setBackground(Color.WHITE);
                      label1.setBackground(Color.black);
                      label2.setBackground(Color.WHITE);
                      blackPanel.setBackground(Color.WHITE);
                      label3.setBackground(Color.WHITE);
                      welcomeLabel.setBackground(Color.WHITE);


                      //action colors for the lining panels
                      welcomeTopPanel.setBackground(Color.black);
                      satisfactionPanel.setBackground(Color.black);
                      demandPanel.setBackground(Color.BLACK);
                      blueOne.setBackground(Color.black);
                      panel.setBackground(Color.BLACK);


                      //action colors for the foreground

                      break;
                  case 1:
                      jogyJogy.setBackground(Color.WHITE);

                  //action colors for the main panels
                  getContentPane().setBackground(Color.yellow);
                  welcomePanel.setBackground(Color.red);
                  label1.setBackground(Color.CYAN);
                  label2.setBackground(Color.magenta);
                  blackPanel.setBackground(Color.blue);
                  label3.setBackground(Color.GREEN);
                  welcomeLabel.setBackground(Color.blue);
                  satisfactionDemandPanel.setBackground(Color.yellow);


                  //action colors for the lining panels
                  welcomeTopPanel.setBackground(Color.black);
                  satisfactionPanel.setBackground(Color.black);
                  demandPanel.setBackground(Color.BLACK);
                  blueOne.setBackground(Color.blue);
                  panel.setBackground(Color.BLACK);


                  //action colors for the foreground
                      welcomeLabel.setForeground(Color.yellow);
                      break;

                  case 2:

                  //action colors for the main panels

                   getContentPane().setBackground(Color.pink);
                  welcomePanel.setBackground(Color.yellow);
                  welcomeTopPanel.setBackground(Color.red);
                  label1.setBackground(Color.green);
                  label2.setBackground(Color.white);
                  blackPanel.setBackground(Color.black);
                  label3.setBackground(Color.magenta);


                  //action colors for the lining panels

                  satisfactionPanel.setBackground(Color.gray);
                  demandPanel.setBackground(Color.gray);
                  blueOne.setBackground(Color.gray);
                  panel.setBackground(Color.gray);


                  //action colors for the foreground
                      break;
                  case 3:
                      //action colors for the main panels

                       getContentPane().setBackground(Color.gray);
                      welcomePanel.setBackground(Color.blue);
                      welcomeTopPanel.setBackground(Color.magenta);
                      label1.setBackground(Color.CYAN);
                      label2.setBackground(Color.yellow);
                      blackPanel.setBackground(Color.orange);
                      label3.setBackground(Color.black);


                      //action colors for the lining panels

                      satisfactionPanel.setBackground(Color.green);
                      demandPanel.setBackground(Color.green);
                      blueOne.setBackground(Color.green);
                      panel.setBackground(Color.green);


                      //action colors for the foreground

                      break;
                  case 4:
                      //action colors for the main panels

                       getContentPane().setBackground(Color.yellow);
                      welcomePanel.setBackground(Color.blue);
                      welcomeTopPanel.setBackground(Color.green);
                      label1.setBackground(Color.CYAN);
                      label2.setBackground(Color.magenta);
                      blackPanel.setBackground(Color.blue);
                      label3.setBackground(Color.GREEN);


                      //action colors for the lining panels

                      satisfactionPanel.setBackground(Color.blue);
                      demandPanel.setBackground(Color.blue);
                      blueOne.setBackground(Color.blue);
                      panel.setBackground(Color.blue);


                      //action colors for the foreground
                      break;
                  case 5:
                       Color textColor = JColorChooser.showDialog(null, "choose color for text😂", blackPanel.getBackground());
                      label3.setForeground(textColor);
                      label2.setForeground(textColor);
                      label1.setForeground(textColor);

                      break;
                  case 6:
                       jogyJogy.setForeground(Color.red);
                      jogyJogy.setBackground(Color.blue);
                      jogyJogy.setFont(new Font("ALGERIAN", Font.ITALIC, 20));

                      welcomePanel.setOpaque(false);
                      blackPanel.setOpaque(false);
                      blueOne.setOpaque(false);
                      label1.setOpaque(false);
                      label1.setForeground(Color.black);
                      label2.setForeground(Color.RED);
                      label2.setOpaque(false);
                      label3.setOpaque(false);
                      satisfactionPanel.setOpaque(false);
                      satisfactionDemandPanel.setOpaque(false);
                      break;
                  case 7:
                       jogyJogy.setForeground(Color.blue);
                      jogyJogy.setBackground(Color.red);
                      jogyJogy.setFont(new Font("Bernard MT Condensed",Font.ITALIC, 20));
                      break;
                  case 8:
                       jogyJogy.setForeground(Color.black);
                      jogyJogy.setBackground(Color.red);
                      jogyJogy.setFont(new Font("curlz mt",Font.ITALIC, 25));
                  case 9:

                      jogyJogy.getUI();
                       //action colors for the main panels
                      getContentPane().setBackground(Color.black);
                      welcomePanel.setBackground(Color.black);
                      label1.setBackground(Color.black);
                      label2.setBackground(Color.black);
                      blackPanel.setBackground(Color.black);
                      label3.setBackground(Color.black);
                      welcomeLabel.setBackground(Color.black);


                      //action colors for the lining panels
                      welcomeTopPanel.setBackground(Color.white);
                      satisfactionPanel.setBackground(Color.white);
                      demandPanel.setBackground(Color.white);
                      blueOne.setBackground(Color.white);
                      panel.setBackground(Color.white);


                      //action colors for the foreground
                      label1.setForeground(Color.black);

                      break;
              }

          });


        BufferedImage bufferedImage1 = null;
        try {
            // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImage1 = ImageIO.read(new File("couples table.jpeg"));
            if (bufferedImage1==null){
                throw new IOException("no image found man!😀😀📸😂, nakuona");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        int targetWidth1 = 225;
        int targetHeight1 = 250;
        BufferedImage newImage1 = new BufferedImage(targetWidth1, targetHeight1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D1 = newImage1.createGraphics();
        graphics2D1.drawImage(bufferedImage1, 0, 0, targetWidth1, targetHeight1, null);
        graphics2D1.dispose();

        ImageIcon image = new ImageIcon(newImage1);
        JLabel decoration = new JLabel(image);



        BufferedImage bufferedImage2;
        try {
            // URL imageUrl = new URL("C://Users//user//IdeaProjectsUntitled cal//HotelSoftCare//couples.jpeg");
            bufferedImage2 = ImageIO.read(new File("couples table1.jpeg"));
            if (bufferedImage2==null){
                throw new IOException("no image found man!😀😀📸😂, nakuona");
            }
        }catch (IOException e){
           throw new IOException("no image this image");
        }
        int targetWidth2 = 225;
        int targetHeight2 = 250;
        BufferedImage newImage2 = new BufferedImage(targetWidth2, targetHeight2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D2 = newImage2.createGraphics();
        graphics2D2.drawImage(bufferedImage2, 0, 0, targetWidth2, targetHeight2, null);
        graphics2D2.dispose();

        ImageIcon image2 = new ImageIcon(newImage2);
        JLabel decoration2 = new JLabel(image2);

        blueOne.add(decoration);
        blueOne.add(blackPanel);
        blueOne.add(decoration2);

        //welcomePanel.add(satisfactionPanel, BorderLayout.AFTER_LAST_LINE);
       // welcomePanel.add(demandPanel, BorderLayout.CENTER);
       //welcomePanel.add(decoration);
        welcomePanel.add(satisfactionDemandPanel, BorderLayout.NORTH);
        welcomePanel.add(blueOne, BorderLayout.WEST);
        //welcomePanel.add(decoration2);
        welcomePanel.add(photo);
        welcomePanel.add(picture);
        welcomePanel.add(photos);
        welcomePanel.add(labelLabel);
        //joging button interface game for the user
        //welcomePanel.add(jogyJogy);

        welcomePanel.add(jogyPanel);

        add(welcomeTopPanel, BorderLayout.NORTH);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame f = new Frame("Chuka University");
        f.setVisible(true);
        int i;
        int x=1;

        for(i=2;i<=600;i+=4,x+=1){
            f.setLocation((230-((i+x)/6) ), (190-(i/5)));
            f.setSize(i+4*x, (int) (i+x/1.2));

            try{
                Thread.sleep(3);
            }catch(Exception ignored) { }
        }
    }
}
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(("chukalogo.png"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(2000);
            this.setVisible(true);
            new MyUserInterface().setVisible(true);
            this.setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}