package com.jadyn.mediakit.audio

import android.media.MediaCodec

/**
 *@version:
 *@FileDescription: PCM 数据对象
 *@Author:Jing
 *@Since:2019-05-20
 *@ChangeList:
 */
class AudioPacket(val buffer: ByteArray, val size: Int, val bufferInfo: MediaCodec.BufferInfo? = null) {

} 