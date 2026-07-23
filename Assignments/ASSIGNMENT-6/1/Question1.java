import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

/* 
  <applet code="Question1" width="500" height="500"></applet>
*/

class Question1 extends Applet implements ActionListener, ItemListener {
    Image backgroundImage;
    AudioClip sound;
    Button btnPlay, btnPause, btnStop;
    Choice imageSelector;
    boolean isPaused = false;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Load default sound (make sure music.wav exists in the same folder)
        sound = getAudioClip(getDocumentBase(), "music.wav");

        // Buttons for sound control
        btnPlay = new Button("Play");
        btnPause = new Button("Pause"); // Note: AudioClip doesn't have true pause, we'll stop it
        btnStop = new Button("Stop");

        // Dropdown for background images
        imageSelector = new Choice();
        imageSelector.add("Nature");
        imageSelector.add("Space");
        imageSelector.add("City");

        // Add components to applet
        add(new Label("Sound:"));
        add(btnPlay);
        add(btnPause);
        add(btnStop);
        add(new Label("Background:"));
        add(imageSelector);

        // Add listeners
        btnPlay.addActionListener(this);
        btnPause.addActionListener(this);
        btnStop.addActionListener(this);
        imageSelector.addItemListener(this);

        // Load initial image
        updateImage();
        
        // Start sound automatically
        if (sound != null) {
            sound.loop();
        }
    }

    void updateImage() {
        String selected = imageSelector.getSelectedItem();
        // Assuming images exist: nature.jpg, space.jpg, city.jpg
        backgroundImage = getImage(getDocumentBase(), selected.toLowerCase() + ".jpg");
        repaint();
    }

    public void paint(Graphics g) {
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        g.setColor(Color.WHITE);
        g.drawString("Student: Beginner Java Programmer", 10, 480);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPlay) {
            if (sound != null) sound.loop();
        } else if (e.getSource() == btnPause || e.getSource() == btnStop) {
            // AudioClip is simple, so stop() acts as both pause and stop
            if (sound != null) sound.stop();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        updateImage();
    }
}
