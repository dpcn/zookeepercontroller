package zookeepercontroller;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: PageLiu
 * Date: 12-11-28
 * Time: 上午2:17
 */
public class EventWatcher implements Watcher {
    private static final Logger log = LoggerFactory
			.getLogger(EventWatcher.class);
    public void process(WatchedEvent event) { 
       // log.info("event="+event ); 
      //  log.info(event.getPath()+";"+event.getState()+";"+event.getType());
    }
}
