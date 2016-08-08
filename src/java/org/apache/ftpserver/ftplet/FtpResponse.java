// $Id: FtpResponse.java 306698 2005-09-07 10:36:22 +0530 (Wed, 07 Sep 2005) rana_b $
/*
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ftpserver.ftplet;

import java.io.IOException;

/**
 * Ftp response interface. Ftplets can use this to send custom messges to client. 
 * 
 * @author <a href="mailto:rana_b@yahoo.com">Rana Bhattacharyya</a>
 */
public 
interface FtpResponse {

    /**
     * Send the ftp server reply code to client.
     */
    void write(int code) throws IOException;
    
    
    /**
     * Send the ftp code and message to client
     */
    void write(int code, String msg) throws IOException;
}
