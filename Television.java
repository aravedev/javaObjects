public class Television {
    // The purpose of this class is to model a television
    // Danny Rave Rua - 57246 - 7th of November 2022

    private final String MANUFACTURER;
    private final int SCREEN_SIZE;  // Screen size for the TV
    private boolean powerOn;         //TV Switch on/off
    private int channel;            // TV channel chose by the user
    private int volume=0;           // TV volume, 0 means noiseless and 100 loud

    /**
     * Constructor
     *
     * @param manufacturer first variable is a string , it is the manufacturer name
     * @param screen_size second variable is an integer, it is the screen size
     */
    public Television(String manufacturer, int screen_size){
        this.MANUFACTURER = manufacturer;
        this.SCREEN_SIZE = screen_size;
        this.powerOn=false;
        this.volume=20;
        this.channel=2;
    }

    /**
     * Methods: Getters
     */

    /**
     * The method getVolume returns a copy of the actual value of Volume.
     * @return this.volume;
     */
    public int getVolume(){
        return this.volume;
    }

    /**
     * The method getChannel return a copy of the actual channel syntonized by the user
     * @return this.channel
     */

    public int getChannel(){
        return this.channel;
    }

    /**
     * the method getManufacturer retuns a copy of the actual value Manufacturer, its format is String.
     * @return this.MANUFACTURER
     */
    public String getManufacturer(){
        return this.MANUFACTURER;
    }

    /**
     * the method getScreenSize returns a copy of the actual screen size of the TV, its format is integer
     * @return this.SCREEN_SIZE;
     */
    public int getScreenSize(){
        return this.SCREEN_SIZE;
    }

    /**
     * Methods: Setters
     */

    /**
     * the method setChannel receives one parameter, and it is used to change the tv channel.
     * @param channel first parameter, its format is integer.
     *
     */
    public void setChannel(int channel){
        this.channel = channel;
    }

    /**
     * the method power change the actual value of powerOn, this method switch on/off the tv.
     */

    public void power(){
        this.powerOn = !this.powerOn;
    }

    /**
     * the method increaseVolume change the volume value and it is increased by 1 each time that it is used.
     */
    public void increaseVolume(){
        this.volume ++;
    }

    /**
     * the method decreaseVolume change the volume value and it is decreased by 1 each time that it is used.
     */
    public void decreaseVolume(){
        this.volume--;
    }

}
