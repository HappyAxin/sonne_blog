
package sonn;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * ����
 * 
 * @author PTR Team
 * @version 1.0
 */
public class Order implements Serializable {

	private static final long serialVersionUID = -3078342809727773232L;

	/**
	 * ����
	 */
	public enum Direction {

		/** ���� */
		asc,

		/** �ݼ� */
		desc;

		/**
		 * ��String�л�ȡDirection
		 * 
		 * @param value
		 *            ֵ
		 * @return String��Ӧ��Direction
		 */
		public static Direction fromString(String value) {
			return Direction.valueOf(value.toLowerCase());
		}
	}

	/** Ĭ�Ϸ��� */
	private static final Direction DEFAULT_DIRECTION = Direction.desc;

	/** ���� */
	private String property;

	/** ���� */
	private Direction direction = DEFAULT_DIRECTION;

	/**
	 * ��ʼ��һ���´�����Order����
	 */
	public Order() {
	}

	/**
	 * @param property
	 *            ����
	 * @param direction
	 *            ����
	 */
	public Order(String property, Direction direction) {
		this.property = property;
		this.direction = direction;
	}

	/**
	 * ���ص�������
	 * 
	 * @param property
	 *            ����
	 * @return ��������
	 */
	public static Order asc(String property) {
		return new Order(property, Direction.asc);
	}

	/**
	 * ���صݼ�����
	 * 
	 * @param property
	 *            ����
	 * @return �ݼ�����
	 */
	public static Order desc(String property) {
		return new Order(property, Direction.desc);
	}

	/**
	 * ��ȡ����
	 * 
	 * @return ����
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * ��������
	 * 
	 * @param property
	 *            ����
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return ����
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * ���÷���
	 * 
	 * @param direction
	 *            ����
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Order other = (Order) obj;
		return new EqualsBuilder().append(getProperty(), other.getProperty()).append(getDirection(), other.getDirection()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getProperty()).append(getDirection()).toHashCode();
	}

}