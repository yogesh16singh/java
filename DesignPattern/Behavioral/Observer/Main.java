
import java.util.List;
import java.util.ArrayList;
interface Subscriber {
    void update(String video); // This is the method the observer will use to get updated with the new video
  }
 class YouTubeSubscriber implements Subscriber {
    private String name; // Name of the subscriber
  
    public YouTubeSubscriber(String name) {
      this.name = name; // Initialize the subscriber with their name
    }
  
    @Override
    public void update(String video) {
      // When notified, this method will execute, and the subscriber watches the
      // new video
      System.out.println(name + " is watching the video: " + video);
    }
  }

   class EmailSubscriber implements Subscriber {
    private String email;
    public EmailSubscriber(String email) {
      this.email = email;
    }
  
    @Override
    public void update(String video) {
      System.out.println(
          "Sending email to " + email + ": New video uploaded: " + video);
    }
  }
  
   class PushNotificationSubscriber implements Subscriber {
    private String userDevice;
    public PushNotificationSubscriber(String userDevice) {
      this.userDevice = userDevice;
    }
  
    @Override
    public void update(String video) {
      System.out.println("Sending push notification to " + userDevice
          + ": New video uploaded: " + video);
    }
  }

   interface YouTubeChannel {
    void addSubscriber(Subscriber subscriber); // Method to add a new subscriber
    void removeSubscriber(Subscriber subscriber); // Method to remove a subscriber
    void notifySubscribers(); // Method to notify all subscribers
  }

   class YouTubeChannelImpl implements YouTubeChannel {
    private List<Subscriber> subscribers =
        new ArrayList<>(); // List of subscribers
    private String video; // The video that will be uploaded
  
    @Override
    public void addSubscriber(Subscriber subscriber) {
      subscribers.add(subscriber); // Add a subscriber to the channel
    }
  
    @Override
    public void removeSubscriber(Subscriber subscriber) {
      subscribers.remove(subscriber); // Remove a subscriber from the channel
    }
  
    @Override
    public void notifySubscribers() {
      // Notify all subscribers about the new video
      for (Subscriber subscriber : subscribers) {
        subscriber.update(video); // Call update() for each subscriber
      }
    }
  
    public void uploadNewVideo(String video) {
      this.video = video; // Set the video that is being uploaded
      notifySubscribers(); // Notify all subscribers about the new video
    }
  }

  public class Main {
    public static void main(String[] args) {
      // Create a YouTube channel
      YouTubeChannelImpl channel = new YouTubeChannelImpl();
      // Create subscribers
      YouTubeSubscriber alice = new YouTubeSubscriber("Alice");
      YouTubeSubscriber bob = new YouTubeSubscriber("Bob");
      // Subscribe to the channel
      channel.addSubscriber(alice);
      channel.addSubscriber(bob);
      // Upload a new video and notify subscribers
      channel.uploadNewVideo("Java Design Patterns Tutorial");
      // Output:
      // Alice is watching the video: Java Design Patterns Tutorial
      // Bob is watching the video: Java Design Patterns Tutorial
      // You can also remove a subscriber and upload another video
      channel.removeSubscriber(bob);
      channel.uploadNewVideo("Observer Pattern in Action");
      // Output:
      // Alice is watching the video: Observer Pattern in Action
    }
  }