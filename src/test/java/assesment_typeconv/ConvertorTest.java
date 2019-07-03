/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package assesment_typeconv;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertorTest {

	@Test
	public void crackUncrack() {
		int initialInt = Integer.MIN_VALUE;
		do {
			Cracked cracked = Convertor.crack(initialInt);
			int uncrackedInt = Convertor.uncrack(cracked);
			assertEquals(initialInt, uncrackedInt);
			initialInt++;
		} while (initialInt != Integer.MIN_VALUE);
	}
}
