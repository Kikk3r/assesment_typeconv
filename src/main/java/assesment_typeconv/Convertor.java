/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package assesment_typeconv;

public class Convertor {
	public static Cracked crack(int value) {
		short hi = (short) (value >>> 16);
		short low = (short) value;
		return new Cracked(hi, low);
	}

	public static int uncrack(Cracked cracked ) {
		return ((int) cracked.hi << 16) + ((int) cracked.low & 0x0000FFFF);
	}
}
