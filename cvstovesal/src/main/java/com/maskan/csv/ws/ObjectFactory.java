
package com.maskan.csv.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.maskan.csv.ws.client.newInteractive package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PullReceivedMessagesResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "pullReceivedMessagesResponse");
    private final static QName _SendMessageOneToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageOneToMany");
    private final static QName _PullReceivedMessages_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "pullReceivedMessages");
    private final static QName _SendMessageUDHOneToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageUDHOneToManyResponse");
    private final static QName _ReferenceResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "referenceResult");
    private final static QName _SendMessageUDHOneToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageUDHOneToMany");
    private final static QName _CountResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "countResult");
    private final static QName _SendMessageManyToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageManyToMany");
    private final static QName _UserResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "userResult");
    private final static QName _SendMessageBinaryUDHManyToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryUDHManyToManyResponse");
    private final static QName _UserSuppliedIdResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "userSuppliedIdResult");
    private final static QName _SendMessageBinaryUDHOneToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryUDHOneToManyResponse");
    private final static QName _SendMessagePortOneToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessagePortOneToMany");
    private final static QName _SendMessageUDHManyToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageUDHManyToMany");
    private final static QName _SendMessageUDHManyToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageUDHManyToManyResponse");
    private final static QName _SendMessageBinaryPortOneToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryPortOneToManyResponse");
    private final static QName _SendMessageManyToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageManyToManyResponse");
    private final static QName _GetUserInfo_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getUserInfo");
    private final static QName _GetReceivedMessageCount_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getReceivedMessageCount");
    private final static QName _SendMessageBinaryUDHOneToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryUDHOneToMany");
    private final static QName _SendMessageBinaryUDHManyToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryUDHManyToMany");
    private final static QName _MessageStateResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "messageStateResult");
    private final static QName _SendMessageBinaryPortManyToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryPortManyToMany");
    private final static QName _SendMessageOneToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageOneToManyResponse");
    private final static QName _MessageResult_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "messageResult");
    private final static QName _SendMessagePortManyToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessagePortManyToMany");
    private final static QName _GetReceivedMessageCountResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getReceivedMessageCountResponse");
    private final static QName _SendMessageBinaryPortManyToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryPortManyToManyResponse");
    private final static QName _SendMessagePortOneToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessagePortOneToManyResponse");
    private final static QName _GetMessageStateResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getMessageStateResponse");
    private final static QName _GetUserInfoResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getUserInfoResponse");
    private final static QName _SendMessagePortManyToManyResponse_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessagePortManyToManyResponse");
    private final static QName _GetMessageState_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "getMessageState");
    private final static QName _SendMessageBinaryPortOneToMany_QNAME = new QName("http://webservice.smsrelay.armaghan.net/", "sendMessageBinaryPortOneToMany");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.maskan.csv.ws.client.newInteractive
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMessagePortOneToMany }
     * 
     */
    public SendMessagePortOneToMany createSendMessagePortOneToMany() {
        return new SendMessagePortOneToMany();
    }

    /**
     * Create an instance of {@link SendMessageUDHManyToManyResponse }
     * 
     */
    public SendMessageUDHManyToManyResponse createSendMessageUDHManyToManyResponse() {
        return new SendMessageUDHManyToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessageBinaryPortOneToManyResponse }
     * 
     */
    public SendMessageBinaryPortOneToManyResponse createSendMessageBinaryPortOneToManyResponse() {
        return new SendMessageBinaryPortOneToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessageUDHManyToMany }
     * 
     */
    public SendMessageUDHManyToMany createSendMessageUDHManyToMany() {
        return new SendMessageUDHManyToMany();
    }

    /**
     * Create an instance of {@link UserSuppliedIdResult }
     * 
     */
    public UserSuppliedIdResult createUserSuppliedIdResult() {
        return new UserSuppliedIdResult();
    }

    /**
     * Create an instance of {@link SendMessageBinaryUDHOneToManyResponse }
     * 
     */
    public SendMessageBinaryUDHOneToManyResponse createSendMessageBinaryUDHOneToManyResponse() {
        return new SendMessageBinaryUDHOneToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessageBinaryUDHManyToManyResponse }
     * 
     */
    public SendMessageBinaryUDHManyToManyResponse createSendMessageBinaryUDHManyToManyResponse() {
        return new SendMessageBinaryUDHManyToManyResponse();
    }

    /**
     * Create an instance of {@link UserResult }
     * 
     */
    public UserResult createUserResult() {
        return new UserResult();
    }

    /**
     * Create an instance of {@link SendMessageUDHOneToMany }
     * 
     */
    public SendMessageUDHOneToMany createSendMessageUDHOneToMany() {
        return new SendMessageUDHOneToMany();
    }

    /**
     * Create an instance of {@link CountResult }
     * 
     */
    public CountResult createCountResult() {
        return new CountResult();
    }

    /**
     * Create an instance of {@link SendMessageManyToMany }
     * 
     */
    public SendMessageManyToMany createSendMessageManyToMany() {
        return new SendMessageManyToMany();
    }

    /**
     * Create an instance of {@link SendMessageOneToMany }
     * 
     */
    public SendMessageOneToMany createSendMessageOneToMany() {
        return new SendMessageOneToMany();
    }

    /**
     * Create an instance of {@link PullReceivedMessagesResponse }
     * 
     */
    public PullReceivedMessagesResponse createPullReceivedMessagesResponse() {
        return new PullReceivedMessagesResponse();
    }

    /**
     * Create an instance of {@link ReferenceResult }
     * 
     */
    public ReferenceResult createReferenceResult() {
        return new ReferenceResult();
    }

    /**
     * Create an instance of {@link PullReceivedMessages }
     * 
     */
    public PullReceivedMessages createPullReceivedMessages() {
        return new PullReceivedMessages();
    }

    /**
     * Create an instance of {@link SendMessageUDHOneToManyResponse }
     * 
     */
    public SendMessageUDHOneToManyResponse createSendMessageUDHOneToManyResponse() {
        return new SendMessageUDHOneToManyResponse();
    }

    /**
     * Create an instance of {@link GetMessageState }
     * 
     */
    public GetMessageState createGetMessageState() {
        return new GetMessageState();
    }

    /**
     * Create an instance of {@link SendMessageBinaryPortOneToMany }
     * 
     */
    public SendMessageBinaryPortOneToMany createSendMessageBinaryPortOneToMany() {
        return new SendMessageBinaryPortOneToMany();
    }

    /**
     * Create an instance of {@link SendMessagePortManyToManyResponse }
     * 
     */
    public SendMessagePortManyToManyResponse createSendMessagePortManyToManyResponse() {
        return new SendMessagePortManyToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessagePortOneToManyResponse }
     * 
     */
    public SendMessagePortOneToManyResponse createSendMessagePortOneToManyResponse() {
        return new SendMessagePortOneToManyResponse();
    }

    /**
     * Create an instance of {@link GetMessageStateResponse }
     * 
     */
    public GetMessageStateResponse createGetMessageStateResponse() {
        return new GetMessageStateResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetReceivedMessageCountResponse }
     * 
     */
    public GetReceivedMessageCountResponse createGetReceivedMessageCountResponse() {
        return new GetReceivedMessageCountResponse();
    }

    /**
     * Create an instance of {@link MessageResult }
     * 
     */
    public MessageResult createMessageResult() {
        return new MessageResult();
    }

    /**
     * Create an instance of {@link SendMessagePortManyToMany }
     * 
     */
    public SendMessagePortManyToMany createSendMessagePortManyToMany() {
        return new SendMessagePortManyToMany();
    }

    /**
     * Create an instance of {@link SendMessageBinaryPortManyToManyResponse }
     * 
     */
    public SendMessageBinaryPortManyToManyResponse createSendMessageBinaryPortManyToManyResponse() {
        return new SendMessageBinaryPortManyToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessageOneToManyResponse }
     * 
     */
    public SendMessageOneToManyResponse createSendMessageOneToManyResponse() {
        return new SendMessageOneToManyResponse();
    }

    /**
     * Create an instance of {@link SendMessageBinaryUDHManyToMany }
     * 
     */
    public SendMessageBinaryUDHManyToMany createSendMessageBinaryUDHManyToMany() {
        return new SendMessageBinaryUDHManyToMany();
    }

    /**
     * Create an instance of {@link MessageStateResult }
     * 
     */
    public MessageStateResult createMessageStateResult() {
        return new MessageStateResult();
    }

    /**
     * Create an instance of {@link SendMessageBinaryPortManyToMany }
     * 
     */
    public SendMessageBinaryPortManyToMany createSendMessageBinaryPortManyToMany() {
        return new SendMessageBinaryPortManyToMany();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link SendMessageManyToManyResponse }
     * 
     */
    public SendMessageManyToManyResponse createSendMessageManyToManyResponse() {
        return new SendMessageManyToManyResponse();
    }

    /**
     * Create an instance of {@link GetReceivedMessageCount }
     * 
     */
    public GetReceivedMessageCount createGetReceivedMessageCount() {
        return new GetReceivedMessageCount();
    }

    /**
     * Create an instance of {@link SendMessageBinaryUDHOneToMany }
     * 
     */
    public SendMessageBinaryUDHOneToMany createSendMessageBinaryUDHOneToMany() {
        return new SendMessageBinaryUDHOneToMany();
    }

    /**
     * Create an instance of {@link Error }
     *
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link MessageState }
     * 
     */
    public MessageState createMessageState() {
        return new MessageState();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PullReceivedMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "pullReceivedMessagesResponse")
    public JAXBElement<PullReceivedMessagesResponse> createPullReceivedMessagesResponse(PullReceivedMessagesResponse value) {
        return new JAXBElement<PullReceivedMessagesResponse>(_PullReceivedMessagesResponse_QNAME, PullReceivedMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageOneToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageOneToMany")
    public JAXBElement<SendMessageOneToMany> createSendMessageOneToMany(SendMessageOneToMany value) {
        return new JAXBElement<SendMessageOneToMany>(_SendMessageOneToMany_QNAME, SendMessageOneToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PullReceivedMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "pullReceivedMessages")
    public JAXBElement<PullReceivedMessages> createPullReceivedMessages(PullReceivedMessages value) {
        return new JAXBElement<PullReceivedMessages>(_PullReceivedMessages_QNAME, PullReceivedMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageUDHOneToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageUDHOneToManyResponse")
    public JAXBElement<SendMessageUDHOneToManyResponse> createSendMessageUDHOneToManyResponse(SendMessageUDHOneToManyResponse value) {
        return new JAXBElement<SendMessageUDHOneToManyResponse>(_SendMessageUDHOneToManyResponse_QNAME, SendMessageUDHOneToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "referenceResult")
    public JAXBElement<ReferenceResult> createReferenceResult(ReferenceResult value) {
        return new JAXBElement<ReferenceResult>(_ReferenceResult_QNAME, ReferenceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageUDHOneToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageUDHOneToMany")
    public JAXBElement<SendMessageUDHOneToMany> createSendMessageUDHOneToMany(SendMessageUDHOneToMany value) {
        return new JAXBElement<SendMessageUDHOneToMany>(_SendMessageUDHOneToMany_QNAME, SendMessageUDHOneToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "countResult")
    public JAXBElement<CountResult> createCountResult(CountResult value) {
        return new JAXBElement<CountResult>(_CountResult_QNAME, CountResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageManyToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageManyToMany")
    public JAXBElement<SendMessageManyToMany> createSendMessageManyToMany(SendMessageManyToMany value) {
        return new JAXBElement<SendMessageManyToMany>(_SendMessageManyToMany_QNAME, SendMessageManyToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "userResult")
    public JAXBElement<UserResult> createUserResult(UserResult value) {
        return new JAXBElement<UserResult>(_UserResult_QNAME, UserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryUDHManyToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryUDHManyToManyResponse")
    public JAXBElement<SendMessageBinaryUDHManyToManyResponse> createSendMessageBinaryUDHManyToManyResponse(SendMessageBinaryUDHManyToManyResponse value) {
        return new JAXBElement<SendMessageBinaryUDHManyToManyResponse>(_SendMessageBinaryUDHManyToManyResponse_QNAME, SendMessageBinaryUDHManyToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSuppliedIdResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "userSuppliedIdResult")
    public JAXBElement<UserSuppliedIdResult> createUserSuppliedIdResult(UserSuppliedIdResult value) {
        return new JAXBElement<UserSuppliedIdResult>(_UserSuppliedIdResult_QNAME, UserSuppliedIdResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryUDHOneToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryUDHOneToManyResponse")
    public JAXBElement<SendMessageBinaryUDHOneToManyResponse> createSendMessageBinaryUDHOneToManyResponse(SendMessageBinaryUDHOneToManyResponse value) {
        return new JAXBElement<SendMessageBinaryUDHOneToManyResponse>(_SendMessageBinaryUDHOneToManyResponse_QNAME, SendMessageBinaryUDHOneToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagePortOneToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessagePortOneToMany")
    public JAXBElement<SendMessagePortOneToMany> createSendMessagePortOneToMany(SendMessagePortOneToMany value) {
        return new JAXBElement<SendMessagePortOneToMany>(_SendMessagePortOneToMany_QNAME, SendMessagePortOneToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageUDHManyToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageUDHManyToMany")
    public JAXBElement<SendMessageUDHManyToMany> createSendMessageUDHManyToMany(SendMessageUDHManyToMany value) {
        return new JAXBElement<SendMessageUDHManyToMany>(_SendMessageUDHManyToMany_QNAME, SendMessageUDHManyToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageUDHManyToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageUDHManyToManyResponse")
    public JAXBElement<SendMessageUDHManyToManyResponse> createSendMessageUDHManyToManyResponse(SendMessageUDHManyToManyResponse value) {
        return new JAXBElement<SendMessageUDHManyToManyResponse>(_SendMessageUDHManyToManyResponse_QNAME, SendMessageUDHManyToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryPortOneToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryPortOneToManyResponse")
    public JAXBElement<SendMessageBinaryPortOneToManyResponse> createSendMessageBinaryPortOneToManyResponse(SendMessageBinaryPortOneToManyResponse value) {
        return new JAXBElement<SendMessageBinaryPortOneToManyResponse>(_SendMessageBinaryPortOneToManyResponse_QNAME, SendMessageBinaryPortOneToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageManyToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageManyToManyResponse")
    public JAXBElement<SendMessageManyToManyResponse> createSendMessageManyToManyResponse(SendMessageManyToManyResponse value) {
        return new JAXBElement<SendMessageManyToManyResponse>(_SendMessageManyToManyResponse_QNAME, SendMessageManyToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getUserInfo")
    public JAXBElement<GetUserInfo> createGetUserInfo(GetUserInfo value) {
        return new JAXBElement<GetUserInfo>(_GetUserInfo_QNAME, GetUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceivedMessageCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getReceivedMessageCount")
    public JAXBElement<GetReceivedMessageCount> createGetReceivedMessageCount(GetReceivedMessageCount value) {
        return new JAXBElement<GetReceivedMessageCount>(_GetReceivedMessageCount_QNAME, GetReceivedMessageCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryUDHOneToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryUDHOneToMany")
    public JAXBElement<SendMessageBinaryUDHOneToMany> createSendMessageBinaryUDHOneToMany(SendMessageBinaryUDHOneToMany value) {
        return new JAXBElement<SendMessageBinaryUDHOneToMany>(_SendMessageBinaryUDHOneToMany_QNAME, SendMessageBinaryUDHOneToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryUDHManyToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryUDHManyToMany")
    public JAXBElement<SendMessageBinaryUDHManyToMany> createSendMessageBinaryUDHManyToMany(SendMessageBinaryUDHManyToMany value) {
        return new JAXBElement<SendMessageBinaryUDHManyToMany>(_SendMessageBinaryUDHManyToMany_QNAME, SendMessageBinaryUDHManyToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageStateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "messageStateResult")
    public JAXBElement<MessageStateResult> createMessageStateResult(MessageStateResult value) {
        return new JAXBElement<MessageStateResult>(_MessageStateResult_QNAME, MessageStateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryPortManyToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryPortManyToMany")
    public JAXBElement<SendMessageBinaryPortManyToMany> createSendMessageBinaryPortManyToMany(SendMessageBinaryPortManyToMany value) {
        return new JAXBElement<SendMessageBinaryPortManyToMany>(_SendMessageBinaryPortManyToMany_QNAME, SendMessageBinaryPortManyToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageOneToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageOneToManyResponse")
    public JAXBElement<SendMessageOneToManyResponse> createSendMessageOneToManyResponse(SendMessageOneToManyResponse value) {
        return new JAXBElement<SendMessageOneToManyResponse>(_SendMessageOneToManyResponse_QNAME, SendMessageOneToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "messageResult")
    public JAXBElement<MessageResult> createMessageResult(MessageResult value) {
        return new JAXBElement<MessageResult>(_MessageResult_QNAME, MessageResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagePortManyToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessagePortManyToMany")
    public JAXBElement<SendMessagePortManyToMany> createSendMessagePortManyToMany(SendMessagePortManyToMany value) {
        return new JAXBElement<SendMessagePortManyToMany>(_SendMessagePortManyToMany_QNAME, SendMessagePortManyToMany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceivedMessageCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getReceivedMessageCountResponse")
    public JAXBElement<GetReceivedMessageCountResponse> createGetReceivedMessageCountResponse(GetReceivedMessageCountResponse value) {
        return new JAXBElement<GetReceivedMessageCountResponse>(_GetReceivedMessageCountResponse_QNAME, GetReceivedMessageCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryPortManyToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryPortManyToManyResponse")
    public JAXBElement<SendMessageBinaryPortManyToManyResponse> createSendMessageBinaryPortManyToManyResponse(SendMessageBinaryPortManyToManyResponse value) {
        return new JAXBElement<SendMessageBinaryPortManyToManyResponse>(_SendMessageBinaryPortManyToManyResponse_QNAME, SendMessageBinaryPortManyToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagePortOneToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessagePortOneToManyResponse")
    public JAXBElement<SendMessagePortOneToManyResponse> createSendMessagePortOneToManyResponse(SendMessagePortOneToManyResponse value) {
        return new JAXBElement<SendMessagePortOneToManyResponse>(_SendMessagePortOneToManyResponse_QNAME, SendMessagePortOneToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getMessageStateResponse")
    public JAXBElement<GetMessageStateResponse> createGetMessageStateResponse(GetMessageStateResponse value) {
        return new JAXBElement<GetMessageStateResponse>(_GetMessageStateResponse_QNAME, GetMessageStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getUserInfoResponse")
    public JAXBElement<GetUserInfoResponse> createGetUserInfoResponse(GetUserInfoResponse value) {
        return new JAXBElement<GetUserInfoResponse>(_GetUserInfoResponse_QNAME, GetUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagePortManyToManyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessagePortManyToManyResponse")
    public JAXBElement<SendMessagePortManyToManyResponse> createSendMessagePortManyToManyResponse(SendMessagePortManyToManyResponse value) {
        return new JAXBElement<SendMessagePortManyToManyResponse>(_SendMessagePortManyToManyResponse_QNAME, SendMessagePortManyToManyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "getMessageState")
    public JAXBElement<GetMessageState> createGetMessageState(GetMessageState value) {
        return new JAXBElement<GetMessageState>(_GetMessageState_QNAME, GetMessageState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageBinaryPortOneToMany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smsrelay.armaghan.net/", name = "sendMessageBinaryPortOneToMany")
    public JAXBElement<SendMessageBinaryPortOneToMany> createSendMessageBinaryPortOneToMany(SendMessageBinaryPortOneToMany value) {
        return new JAXBElement<SendMessageBinaryPortOneToMany>(_SendMessageBinaryPortOneToMany_QNAME, SendMessageBinaryPortOneToMany.class, null, value);
    }

}
