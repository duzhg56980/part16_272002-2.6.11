import com.alibaba.dubbo.rpc.cluster.support.FailsafeCluster;
public class FunctionUse1 {
public void funcUse() {
FailsafeCluster failsafecluster = new FailsafeCluster();
failsafecluster.join(null);
}
}