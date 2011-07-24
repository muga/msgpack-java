//
// MessagePack for Java
//
// Copyright (C) 2009-2011 FURUHASHI Sadayuki
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.packer;

import java.io.OutputStream;
import java.io.IOException;

import org.msgpack.MessagePack;
import org.msgpack.io.StreamOutput;


public class JSONStreamPacker extends AbstractJSONPacker {
    public JSONStreamPacker(OutputStream stream) {
        this(new MessagePack(), stream);
    }

    public JSONStreamPacker(MessagePack msgpack, OutputStream stream) {
	super(msgpack, new StreamOutput(stream));
    }

    public void close() throws IOException {
        out.close();
    }
}

