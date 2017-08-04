package it.emagrav.enumsample.adavanced;

public enum Audio {
    
    // Spazio per gli elementi dell'enumerazione
	MP3("mp3",128) {
	    @Override
	    public String reproduce(String archive) {
	        return archive+" > file MP3";
	    }
	},
	 
	PCM("PCM"){
	    @Override
	    public String reproduce(String archive) {
	        return archive+" > file PCM";
	    }
	},
	 
	DD("Dolby Digital",256){
	    @Override
	    public String reproduce(String archive){
	        return archive+" > file Dolby Digital";
	    }
	 
	    @Override
	    public String toString(){
	        //Override del metodo toString()
	        return "Dolby";
	    }
	};    
   
	// Spazio per i membri della classe "elemento enumerazione"
    private final String channel;
    private final int bitrate;
   
	// Spazio per i costruttori della classe "elemento enumerazione"
    Audio(String channel,int bitrate) {
        this.channel=channel;
        this.bitrate=bitrate;
    }
   
    Audio(String channel) {
        this.channel=channel;
        bitrate = -1;
    }
   
    //spazio per i metodi pubblici
    public abstract String reproduce(String archive);
     
    // getter e setter
    public String getChannel() {
        return channel;
    }
     
    public int getBitrate() {
        return bitrate;
    }
}