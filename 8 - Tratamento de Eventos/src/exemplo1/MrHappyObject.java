package exemplo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MrHappyObject {
    private Mood _mood = Mood.HAPPY;
    private List _listeners = new ArrayList();
    
    public void receivePinch() {
        if( _mood == Mood.HAPPY ) {
            _mood = Mood.ANNOYED;
            _fireMoodEvent();
        } else {
            _mood = Mood.ANGRY;
            _fireMoodEvent();
        }
    }
    public  void receiveHug() {
        if( _mood == Mood.ANGRY ) {
            _mood = Mood.ANNOYED;
            _fireMoodEvent();
        } else {
            _mood = Mood.HAPPY;
            _fireMoodEvent();
        }
    }
    public  void addMoodListener( MoodListener l ) {
        _listeners.add( l );
    }
    
    public  void removeMoodListener( MoodListener l ) {
        _listeners.remove( l );
    }
     
    private  void _fireMoodEvent() {
        MoodEvent mood = new MoodEvent( this, _mood );
        Iterator listeners = _listeners.iterator();
        while( listeners.hasNext() ) {
            ( (MoodListener) listeners.next() ).moodReceived( mood );
        }
    }
}