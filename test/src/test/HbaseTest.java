/*
package test;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;

import java.io.IOException;


public class HbaseTest {

  public static void main(String[] args) throws IOException {
    System.out.println("Hbase Demo Application ");


    HBaseConfiguration config = new HBaseConfiguration();
    config.set("hbase.zookeeper.quorum", "nj02-lbs-impala4.nj02.baidu.com");
    config.set("hbase.zookeeper.property.clientPort", "8181");


    System.out.println("HBase is running!");

    HTable table = new HTable(config, "mytable");
    System.out.println("Table mytable obtained ");
  }
}
*/