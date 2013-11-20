
package scom.antony.data.buffers;

import scom.antony.data.buffers.BufferProto.RpcException;



public interface RpcCallbackException<ParameterType> {

    void failure(RpcException ex);
}
