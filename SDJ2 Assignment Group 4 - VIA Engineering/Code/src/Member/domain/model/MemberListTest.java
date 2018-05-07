package Member.domain.model;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberListTest {
	Member member1 = new Member("Taha", 26, "paid");
	Member member2 = new Member("Alex", 24, "not paid");
	Member member3 = new Member("Oskar", 22, "not paid");
	MemberList list = new MemberList();

	@Test
	public void testAddMember() {
		list.addMember(member1);
		list.addMember(member2);
		list.addMember(member3);
	}

	@Test
	public void testGetsNumberOfMembers() {
		list.addMember(member1);
		list.addMember(member2);
		list.addMember(member3);
		assertEquals(3, list.getNumberOfMembers());
	}

	@Test
	public void testGetsMember() {
		list.addMember(member1);
		list.addMember(member2);
		list.addMember(member3);
		assertEquals(member1, list.getMember(0));
		assertEquals(member2, list.getMember(1));
		assertEquals(member3, list.getMember(2));
	}

	@Test
	public void testGetsMembershipNotPaid() {
		list.addMember(member1);
		list.addMember(member2);
		list.addMember(member3);
		assertEquals(member2, list.getMembershipNotPaid().getMember(0));
		assertEquals(member3, list.getMembershipNotPaid().getMember(1));
	}
}
